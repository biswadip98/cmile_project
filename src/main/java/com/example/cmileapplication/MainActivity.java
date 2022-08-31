package com.example.cmileapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.cmileapplication.EntityClass.UserModel;

public class MainActivity extends AppCompatActivity {



    EditText id,name,department,designation;
    Button save,getdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id=findViewById(R.id.id);
        name=findViewById(R.id.name);
        department=findViewById(R.id.department);
        designation=findViewById(R.id.designation);
        save=findViewById(R.id.save);
        getdata=findViewById(R.id.getdata);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                saveData();

               boolean check = validateinfo(id,name,department,designation);
                if (check==true){
                    saveData();
//                    Toast.makeText(MainActivity.this, "Data Is Valid", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Sorry Check Again",Toast.LENGTH_SHORT).show();

                }


            }
        });

        getdata.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),GetData.class));
            }
        });


    }

    private Boolean validateinfo(EditText id, EditText name, EditText department, EditText designation) {
        if (id.length()==0){
            id.requestFocus();
            id.setError("FIELD CANNOT BE EMPTY! FILL IT PROPERLY");
            return false;
        }
        else if (name.length()==0){
            name.requestFocus();
            name.setError("FIELD CANNOT BE EMPTY! FILL IT PROPERLY");
            return false;
        }
        else if (department.length()==0){
            department.requestFocus();
            department.setError("FIELD CANNOT BE EMPTY! FILL IT PROPERLY");
            return false;
        }
        else if (designation.length()==0){
            designation.requestFocus();
            designation.setError("FIELD CANNOT BE EMPTY! FILL IT PROPERLY");
            return false;
        }
        else{
            return true ;
        }


    }




    private void saveData()
    {
        if (id.length()==0){
            Toast.makeText(getApplicationContext(),"Sorry Check Again",Toast.LENGTH_SHORT).show();
        }else if (name.length()==0){
            Toast.makeText(getApplicationContext(),"Sorry Check Again",Toast.LENGTH_SHORT).show();
        }else if (department.length()==0){
            Toast.makeText(getApplicationContext(),"Sorry Check Again",Toast.LENGTH_SHORT).show();
        }else if (designation.length()==0){
            Toast.makeText(getApplicationContext(),"Sorry Check Again",Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getApplicationContext(),"your data is valid",Toast.LENGTH_SHORT).show();
        }



        String id_text=id.getText().toString().trim();
        String name_text=name.getText().toString().trim();
        String department_text=department.getText().toString().trim();
        String designation_text=designation.getText().toString().trim();



            UserModel model = new UserModel();

            model.setId(id_text);
            model.setName(name_text);
            model.setDepartment(department_text);
            model.setDesignation(designation_text);



            id.setText(" ");
            name.setText(" ");
            department.setText(" ");
            designation.setText(" ");


            DatabaseClass.getDatabase(getApplicationContext()).getDao().insertAllData(model);
            Toast.makeText(this, "Your Data Is Successfully Saved", Toast.LENGTH_LONG).show();



    }


}


