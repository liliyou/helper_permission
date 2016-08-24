package android.helperanimation.com.helperanimation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

/**
 * Created by lili on 2016/4/13.
 */
public class MainActivity extends AppCompatActivity
{
	public static final String TAG = "MainActivity";

	@Override
	protected void onCreate(
			@Nullable
			Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setParentContentView();
		initBaseView();
	}

	public void setParentContentView()
	{
		setContentView(R.layout.activity_main);
	}

	private void initBaseView()
	{
		TextView txtContent = (TextView) findViewById(R.id.txtContent);
		RecyclerView rcView = (RecyclerView) findViewById(R.id.rcView);
		rcView.setLayoutManager(new GridLayoutManager(this, 2));
		ItemAdapter itemAdapter = new ItemAdapter(this,txtContent);
		rcView.setAdapter(itemAdapter);
	}
}

