package sti.gimay.registrationform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    TextView  tv_name, tv_phone, tv_gender, tv_hobbies, tv_course;
    String tv_name_value, tv_phone_value, tv_gender_value, tv_hobbies_value, tv_course_value;
    String rb_gender_value;
    String cb_hobbies_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

        tv_name_value = intent.getStringExtra("tv_name_value");
        tv_phone_value = intent.getStringExtra("tv_phone_value");
        rb_gender_value = intent.getStringExtra("rb_gender_value");
        cb_hobbies_value = intent.getStringExtra("cb_hobbies_value");
        tv_course_value = intent.getStringExtra("tv_course_value");

        tv_name = (TextView) findViewById(R.id.tv_name);
        tv_phone = (TextView) findViewById(R.id.tv_phone);
        tv_gender = (TextView) findViewById(R.id.tv_gender);
        tv_hobbies = (TextView) findViewById(R.id.tv_hobbies);
        tv_course = (TextView) findViewById(R.id.tv_course);

        tv_name.setText(tv_name_value);
        tv_phone.setText(tv_phone_value);
        tv_gender.setText(rb_gender_value);
        tv_hobbies.setText(cb_hobbies_value);
        tv_course.setText(tv_course_value);


    }
}
