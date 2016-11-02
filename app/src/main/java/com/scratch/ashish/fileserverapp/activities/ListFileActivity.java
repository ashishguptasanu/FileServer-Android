package com.scratch.ashish.fileserverapp.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.scratch.ashish.fileserverapp.R;
import com.scratch.ashish.fileserverapp.models.Branch;
import com.scratch.ashish.fileserverapp.models.College;
import com.scratch.ashish.fileserverapp.models.CollegeResponse;
import com.scratch.ashish.fileserverapp.models.Course;
import com.scratch.ashish.fileserverapp.models.Subject;
import com.scratch.ashish.fileserverapp.models.Year;
import com.scratch.ashish.fileserverapp.models.json;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ListFileActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {
    String url = "https://s3.ap-south-1.amazonaws.com/rufly/new+json";
    Spinner collegeSpinner, branchSpinner, courseSpinner, yearSpinner, subjectSpinner;
    int selectedCollege, selectedBranch, selectedYear, selectedCourse, selectedSubject;
    Button btn;
    String selectedSubjectId;
    Context context;

    List<College> colleges = new ArrayList<>();
    List<Branch> branches = new ArrayList<>();
    List<Year> years = new ArrayList<>();
    List<Course> courses = new ArrayList<>();
    List<Subject> subjects = new ArrayList<>();
    private ArrayList<CollegeResponse> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_file);
        initializeViews();
        loadJSON();
        //new RetrieveFeedTask().execute(url);
    }

    private void initializeViews() {
        collegeSpinner = (Spinner) findViewById(R.id.college_spinner);
        collegeSpinner.setOnItemSelectedListener(this);
        branchSpinner = (Spinner) findViewById(R.id.branch_spinner);
        branchSpinner.setEnabled(false);
        courseSpinner = (Spinner) findViewById(R.id.course_spinner);
        courseSpinner.setEnabled(false);
        yearSpinner = (Spinner) findViewById(R.id.year_spinner);
        yearSpinner.setEnabled(false);
        subjectSpinner = (Spinner) findViewById(R.id.subject_spinner);
        subjectSpinner.setEnabled(false);
        btn = (Button)findViewById(R.id.submit);
    }

    private InputStream retrieveStream(String url) {
        DefaultHttpClient client = new DefaultHttpClient();
        HttpGet getRequest = new HttpGet(url);
        try {
            HttpResponse getResponse = client.execute(getRequest);
            final int statusCode = getResponse.getStatusLine().getStatusCode();
            if (statusCode != HttpStatus.SC_OK) {
                Log.w(getClass().getSimpleName(),
                        "Error " + statusCode + " for URL " + url);
                return null;
            }
            HttpEntity getResponseEntity = getResponse.getEntity();
            return getResponseEntity.getContent();

        }
        catch (IOException e) {
            getRequest.abort();
            Log.w(getClass().getSimpleName(), "Error for URL " + url, e);
        }



        return null;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        switch (parent.getId()){
            case R.id.college_spinner:
                selectedCollege = collegeSpinner.getSelectedItemPosition();
                branchSpinner.setEnabled(true);
                branchSpinner.setOnItemSelectedListener(this);
                populateBranchSpinner();
                break;

            case R.id.branch_spinner:
                selectedBranch = branchSpinner.getSelectedItemPosition();
                courseSpinner.setEnabled(true);
                courseSpinner.setOnItemSelectedListener(this);
                populateCourseSpinner();
                break;
            case R.id.course_spinner:
                selectedCourse = courseSpinner.getSelectedItemPosition();
                yearSpinner.setEnabled(true);
                yearSpinner.setOnItemSelectedListener(this);
                populateYearSpinner();
                break;
            case R.id.year_spinner:
                selectedYear = yearSpinner.getSelectedItemPosition();
                subjectSpinner.setEnabled(true);
                subjectSpinner.setOnItemSelectedListener(this);
                populateSubjectSpinner();
                break;
            case R.id.subject_spinner:
                selectedSubject = subjectSpinner.getSelectedItemPosition();
                Subject selctedSubject = (Subject) parent.getSelectedItem();
                selectedSubjectId = selctedSubject.getSubjectId();
                btn.setOnClickListener(this);
                break;

        }
    }




    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.submit:
                if(selectedBranch != 0 && selectedSubject !=0 && selectedCollege != 0 && selectedYear != 0 && selectedCourse != 0 ){
                    Intent intent = new Intent(this, FinalFile.class);
                    intent.putExtra("subjectid", selectedSubjectId);
                    startActivity(intent);
                    System.out.println(selectedCollege+ selectedBranch + selectedCourse + selectedYear + selectedSubject);
                }
                else{
                    Toast.makeText(this, "Select all fields" , Toast.LENGTH_SHORT ).show();
                }
                break;

        }
    }

    /*class RetrieveFeedTask extends AsyncTask<Object, Object, List<College>> {

        private Exception exception;

        public List<College> doInBackground(Object... urls) {
            InputStream source = retrieveStream(url);
            Gson gson = new Gson();
            Reader reader = new InputStreamReader(source);
            CollegeResponse response = gson.fromJson(reader,CollegeResponse.class);
            List<College> colleges = response.getColleges();

            return colleges;
        }

        protected void onPostExecute(List<College> feed) {
            colleges = feed;
            populateCollegeSpinner ();
        }
    }*/
    private void loadJSON(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://s3.ap-south-1.amazonaws.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        json request = retrofit.create(json .class);
        Call<CollegeResponse> call = request.getJSON();
        call.enqueue(new Callback<CollegeResponse>() {
            @Override
            public void onResponse(Call<CollegeResponse> call, Response<CollegeResponse> response) {

                CollegeResponse jsonResponse = response.body();
                colleges = jsonResponse.getColleges();
                populateCollegeSpinner();
            }

            @Override
            public void onFailure(Call<CollegeResponse> call, Throwable t) {
                Log.d("Error",t.getMessage());
            }
        });
    }

    private void populateCollegeSpinner() {
        ArrayAdapter<College> dataAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, colleges);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        collegeSpinner.setAdapter(dataAdapter);


    }
    private void populateBranchSpinner() {
        branches = colleges.get(selectedCollege).getBranches();
        ArrayAdapter<Branch> dataAdapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, branches);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        branchSpinner.setAdapter(dataAdapter2);


    }
    private void populateCourseSpinner() {
        courses = branches.get(selectedBranch).getCourses();
        ArrayAdapter<Course> dataAdapter3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, courses);
        dataAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        courseSpinner.setAdapter(dataAdapter3);


    }
    private void populateYearSpinner() {
        years = courses.get(selectedCourse).getYears();
        ArrayAdapter<Year> dataAdapter4 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, years);
        dataAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        yearSpinner.setAdapter(dataAdapter4);

    }

    private void populateSubjectSpinner() {
        subjects = years.get(selectedYear).getSubjects();
        ArrayAdapter<Subject> dataAdapter5 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, subjects);
        dataAdapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        subjectSpinner.setAdapter(dataAdapter5);

    }



}
