package debugthugs.mdgiitr.com.cameraapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //declare variables
    Button cameraButton;
    ImageView imageView;
    static final int CAMERA_PIC_REQUEST = 1024;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assign value
        cameraButton = (Button) findViewById(R.id.button); //R??? Resource
        imageView = (ImageView) findViewById(R.id.imageView);


        cameraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //declaring intent => to move from one activity to other

                //Example:new Intent(Your Current Activity's context, To other Activity's context)
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);



                //start intent, we will be using startActivityForResult ,
                //This function requires a **request code** (an integer)

                //startActivityForResult(intent,**1024**); just because bad practice :(
                startActivityForResult(intent,CAMERA_PIC_REQUEST); //always use variables

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //super.onActivityResult(requestCode, resultCode, data);

        //this function is called by startActivityForResult
        //requestCode is used to uniquely identify which activity Intent is executed by
        //startActivityForResult (in case you have multiple startActivityForResult)

        if(requestCode == CAMERA_PIC_REQUEST && resultCode == RESULT_OK){

            Bitmap image = (Bitmap) data.getExtras().get("data");
            //go home and search bitmap
            //here data is the **key** with image as its value
            //**key : value pairs**

            imageView.setImageBitmap(image);
            //setting content (here the image we captured)


            //code finished : tadaaaaaaa!!! Run your program on your device to use your
            //own camera app!!
            //**clap for your app...selfie toh capture kar hi lo** :p

            //recaplep time....
        }

    }
}
//www.github.com/mdg-iitr
//check out blogs on www.mdg.iitr.ac.in/blog
//play with the code to learn more

//Thanks!!!