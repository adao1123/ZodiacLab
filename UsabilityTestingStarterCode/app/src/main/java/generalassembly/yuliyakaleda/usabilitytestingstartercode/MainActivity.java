package generalassembly.yuliyakaleda.usabilitytestingstartercode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ListFragment.OnZodiacSelelectedListener{

  private static ArrayList<Zodiac> zodiacList;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    zodiacList = new ArrayList<>();
    makeZodiacList();

    //TODO: Create a separate layout xml file for tablet devices.
  }

  @Override
  public void onZodiacSelected(int selectedZodiac) {
    DetailsFragment detailsFragment = (DetailsFragment)getSupportFragmentManager().findFragmentById(R.id.detail_frag);
    detailsFragment.setZodiacName(zodiacList.get(selectedZodiac).getName());
    detailsFragment.setDate(zodiacList.get(selectedZodiac).getDate());
    detailsFragment.setInfo(zodiacList.get(selectedZodiac).getText());
    detailsFragment.setZodiacImage(zodiacList.get(selectedZodiac).getImageID());
  }

  private void makeZodiacList(){
    zodiacList.add(new Zodiac(getString(R.string.aries_name),getString(R.string.aries_info),getString(R.string.aries_date),R.drawable.aries));
    zodiacList.add(new Zodiac(getString(R.string.cancer_name), getString(R.string.cancer_info), getString(R.string.cancer_date), R.drawable.cancer));
    zodiacList.add(new Zodiac(getString(R.string.libra_name), getString(R.string.libra_info), getString(R.string.libra_date), R.drawable.libra));
    zodiacList.add(new Zodiac(getString(R.string.capricorn_name), getString(R.string.cancer_info), getString(R.string.capricorn_date), R.drawable.capricorn));
    zodiacList.add(new Zodiac(getString(R.string.taurus_name), getString(R.string.taurus_info), getString(R.string.taurus_date), R.drawable.taurus));
    zodiacList.add(new Zodiac(getString(R.string.leo_name), getString(R.string.leo_info), getString(R.string.leo_date), R.drawable.leo));
    zodiacList.add(new Zodiac(getString(R.string.scorpio_name), getString(R.string.scorpio_info), getString(R.string.scorpio_date), R.drawable.scorpio));
    zodiacList.add(new Zodiac(getString(R.string.aquarius_name), getString(R.string.aquarius_info), getString(R.string.aquarius_date), R.drawable.aquarius));
    zodiacList.add(new Zodiac(getString(R.string.gemini_name), getString(R.string.gemini_info), getString(R.string.gemini_date), R.drawable.gemini));
    zodiacList.add(new Zodiac(getString(R.string.virgo_name), getString(R.string.virgo_info), getString(R.string.virgo_date), R.drawable.virgo));
    zodiacList.add(new Zodiac(getString(R.string.sagittarius_name), getString(R.string.sagittarius_info), getString(R.string.sagittarius_date), R.drawable.sagittarius));
    zodiacList.add(new Zodiac(getString(R.string.pisces_name),getString(R.string.pisces_info),getString(R.string.pisces_date),R.drawable.pisces));

  }
}
