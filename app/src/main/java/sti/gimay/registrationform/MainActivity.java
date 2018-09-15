package sti.gimay.registrationform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Initialize
    TextView  tv_name, tv_phone, tv_gender, tv_hobbies, tv_course;
    EditText et_name, et_phone;
    RadioButton rb_female, rb_male;
    CheckBox cb_singing, cb_dancing, cb_playing, cb_sleeping;
    Spinner sp_course;
    NumberPicker pk_number;
    Button  bt_submit;

    String tv_name_value, tv_phone_value, tv_gender_value, tv_hobbies_value, tv_course_value;
    String rb_gender_value;
    String cb_hobbies_value;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_name = (TextView) findViewById(R.id.tv_name);
        tv_phone = (TextView) findViewById(R.id.tv_phone);
        tv_gender = (TextView) findViewById(R.id.tv_gender);
        tv_hobbies = (TextView) findViewById(R.id.tv_hobbies);
        tv_course = (TextView) findViewById(R.id.tv_course);

        et_name = (EditText) findViewById(R.id.et_name);
        et_phone = (EditText) findViewById(R.id.et_phone);

        rb_female = (RadioButton) findViewById(R.id.rb_female);
        rb_male = (RadioButton) findViewById(R.id.rb_male);

        cb_singing = (CheckBox) findViewById(R.id.cb_singing);
        cb_dancing = (CheckBox) findViewById(R.id.cb_dancing);
        cb_playing = (CheckBox) findViewById(R.id.cb_playing);
        cb_sleeping = (CheckBox) findViewById(R.id.cb_sleeping);

        sp_course = (Spinner) findViewById(R.id.sp_course);

        pk_number = (NumberPicker) findViewById(R.id.pk_number);

        bt_submit = (Button) findViewById(R.id.bt_submit);

        bt_submit.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_submit:
                tv_name_value = et_name.getText().toString();
                tv_phone_value = et_phone.getText().toString();
                tv_course_value = sp_course.getSelectedItem().toString();

//                rb_gender_value = "";
                if (rb_female.isChecked()) {
                    rb_gender_value = "Female";
                }
                else {
                    rb_gender_value = "Male";
                }

                cb_hobbies_value = "";
                if (cb_singing.isChecked()) {
                    cb_hobbies_value += "Singing, ";
                }
                if (cb_dancing.isChecked()){
                    cb_hobbies_value += "Dancing, ";
                }
                if (cb_playing.isChecked()) {
                    cb_hobbies_value += "Playing, ";
                }
                if (cb_sleeping.isChecked()) {
                    cb_hobbies_value += "Sleeping ,";
                }

                Toast.makeText(this, "Submitted", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(this, Main2Activity.class);
                intent.putExtra("tv_name_value", tv_name_value);
                intent.putExtra("tv_phone_value", tv_phone_value);
                intent.putExtra("rb_gender_value", rb_gender_value);
                intent.putExtra("cb_hobbies_value", cb_hobbies_value);
                intent.putExtra("tv_course_value", tv_course_value);
                startActivity(intent);
                break;
        }
    }
}
