package in.tejas.tkgallery;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class PhotoActivity extends AppCompatActivity {

    ImageView photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);
        photo=findViewById(R.id.photo);



        Bundle bundle=getIntent().getExtras();
        String img=bundle.getString("photo");
        photo.setImageBitmap(BitmapFactory.decodeFile(img));
//        Glide.with(this).load(img).into(photo);

    }
}