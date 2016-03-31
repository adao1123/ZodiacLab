package generalassembly.yuliyakaleda.usabilitytestingstartercode;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;


public class DetailsFragment extends Fragment{

    ImageView zodiacImage;
    ImageView planetImage;
    TextView title;
    TextView info;
    TextView date;

    @Nullable @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    //TODO: Inflate the view and change the return type;
      return inflater.inflate(R.layout.details_activity_layout,container,false);
    }

    public void updateContent(String sign) {
    // TODO: Finish the method which will open a webview and redirect the user to the website
    // TODO: to read about the sign that was clicked in the ListView
    }

    public void setZodiacName(String name){
        title = (TextView)getView().findViewById(R.id.titleID);
        title.setText(name);
    }

    public void setZodiacImage(int imageID){
        zodiacImage = (ImageView)getView().findViewById(R.id.zodiacImageID);
        zodiacImage.setImageResource(imageID);
    }
    public void setInfo (String info){
        this.info = (TextView)getView().findViewById(R.id.infoID);
        this.info.setText(info);
    }
    public void setDate(String date){
        this.date = (TextView)getView().findViewById(R.id.dateID);
        this.date.setText(date);
    }

}
