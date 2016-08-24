package android.helperanimation.com.helperanimation;

import android.app.Activity;
import android.simpleanimation.com.Flippers;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by lili on 2015/8/17.
 */
public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.RecyclerViewHolder>
{
	
	private final LayoutInflater mLayoutInflater;
	private final Activity activity;
	private String[] arrayAnimation;
	private TextView txtContent;
	
	public ItemAdapter(Activity activity, TextView txtContent)
	{
		
		this.activity = activity;
		this.txtContent = txtContent;
		mLayoutInflater = LayoutInflater.from(activity);
		arrayAnimation = activity.getResources().getStringArray(R.array.array_animation);
	}
	
	@Override
	public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
	{
		
		return new RecyclerViewHolder(
				mLayoutInflater.inflate(R.layout.item_animation_name, parent, false));
	}
	
	@Override
	public void onBindViewHolder(final RecyclerViewHolder holder, final int position)
	{
		
		holder.txtAnimation.setText(arrayAnimation[position]);
		holder.txtAnimation.setTag(arrayAnimation[position]);
		holder.txtAnimation.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				//				attentionOnClick(v);
				//				founcingEntrancesOnClick(v);
				//				fadingEntrancesOnClick(v);
				//				fadingExitsOnClick(v);
				flippersOnClick(v);
			}
		});
	}

	private void flippersOnClick(View v)
	{
		Flippers flippers = new Flippers();
		String viewContent = v.getTag().toString();

		if (viewContent.equals("FlipInXAnimator"))
		{
			flippers.flipInXAnimator(txtContent);
			txtContent.setText("Class: Flippers");
		}
		if (viewContent.equals("FlipInYAnimator"))
		{
			flippers.flipInYAnimator(txtContent);
			txtContent.setText("Class: Flippers");
		}
		if (viewContent.equals("FlipOutXAnimator"))
		{
			flippers.flipOutXAnimator(txtContent);
			txtContent.setText("Class: Flippers");
		}
		if (viewContent.equals("FlipOutYAnimator"))
		{
			flippers.flipOutYAnimator(txtContent);
			txtContent.setText("Class: Flippers");
		}
	}
	
	//	private void fadingExitsOnClick(View v)
	//	{
	//		FadingExits fadingExits = new FadingExits();
	//		String viewContent = v.getTag().toString();
	//
	//		if (viewContent.equals("FadeOutAnimator"))
	//		{
	//			fadingExits.fadeOutAnimator(txtContent);
	//			txtContent.setText("Class: FadingExits");
	//		}
	//		if (viewContent.equals("FadeOutDownAnimator"))
	//		{
	//			fadingExits.fadeOutDownAnimator(txtContent);
	//			txtContent.setText("Class: FadingExits");
	//		}
	//		if (viewContent.equals("FadeOutLeftAnimator"))
	//		{
	//			fadingExits.fadeOutLeftAnimator(txtContent);
	//			txtContent.setText("Class: FadingExits");
	//		}
	//		if (viewContent.equals("FadeOutRightAnimator"))
	//		{
	//			fadingExits.fadeOutRightAnimator(txtContent);
	//			txtContent.setText("Class: FadingExits");
	//		}
	//		if (viewContent.equals("FadeOutUpAnimator"))
	//		{
	//			fadingExits.fadeOutUpAnimator(txtContent);
	//			txtContent.setText("Class: FadingExits");
	//		}
	//	}
	
	//	private void fadingEntrancesOnClick(View v)
	//	{
	//		FadingEntrances fadingEntrances = new FadingEntrances();
	//		String viewContent = v.getTag().toString();
	//
	//		if (viewContent.equals("FadeInAnimator"))
	//		{
	//			fadingEntrances.fadeInAnimator(txtContent);
	//			txtContent.setText("Class: FadingEntrances");
	//		}
	//		if (viewContent.equals("FadeInDownAnimator"))
	//		{
	//			fadingEntrances.fadeInDownAnimator(txtContent);
	//			txtContent.setText("Class: FadingEntrances");
	//		}
	//		if (viewContent.equals("FadeInLeftAnimator"))
	//		{
	//			fadingEntrances.fadeInLeftAnimator(txtContent);
	//			txtContent.setText("Class: FadingEntrances");
	//		}
	//		if (viewContent.equals("FadeInRightAnimator"))
	//		{
	//			fadingEntrances.fadeInRightAnimator(txtContent);
	//			txtContent.setText("Class: FadingEntrances");
	//		}
	//		if (viewContent.equals("FadeInUpAnimator"))
	//		{
	//			fadingEntrances.fadeInUpAnimator(txtContent);
	//			txtContent.setText("Class: FadingEntrances");
	//		}
	//	}
	//	private void bouncingEntrancesOnClick(View v)
	//	{
	//		BouncingEntrances bouncingEntrances = new BouncingEntrances();
	//		String viewContent = v.getTag().toString();
	//
	//		if (viewContent.equals("BounceInAnimator"))
	//		{
	//			bouncingEntrances.bounceInAnimator(txtContent);
	//			txtContent.setText("Class: BouncingEntrances");
	//		}
	//		if (viewContent.equals("BounceInDownAnimator"))
	//		{
	//			bouncingEntrances.bounceInDownAnimator(txtContent);
	//			txtContent.setText("Class: BouncingEntrances");
	//		}
	//		if (viewContent.equals("BounceInLeftAnimator"))
	//		{
	//			bouncingEntrances.bounceInLeftAnimator(txtContent);
	//			txtContent.setText("Class: BouncingEntrances");
	//		}
	//		if (viewContent.equals("BounceInRightAnimator"))
	//		{
	//			bouncingEntrances.bounceInRightAnimator(txtContent);
	//			txtContent.setText("Class: BouncingEntrances");
	//		}
	//		if (viewContent.equals("BounceInUpAnimator"))
	//		{
	//			bouncingEntrances.bounceInUpAnimator(txtContent);
	//			txtContent.setText("Class: BouncingEntrances");
	//		}
	//	}
	
	//	private void attentionOnClick(View v)
	//	{
	//		Attention attention = new Attention();
	//		String viewContent = v.getTag().toString();
	//
	//		if (viewContent.equals("BounceAnimator"))
	//		{
	//			attention.bounceAnimator(viewContent);
	//			txtContent.setText("Class: Attention");
	//		}
	//		if (viewContent.equals("FlashAnimator"))
	//		{
	//			attention.flashAnimator(viewContent);
	//			txtContent.setText("Class: Attention");
	//		}
	//		if (viewContent.equals("PulseAnimator"))
	//		{
	//			attention.pulseAnimator(viewContent);
	//			txtContent.setText("Class: Attention");
	//		}
	//		if (viewContent.equals("StandUpAnimator"))
	//		{
	//			attention.standUpAnimator(viewContent);
	//			txtContent.setText("Class: Attention");
	//		}
	//		if (viewContent.equals("SwingAnimator"))
	//		{
	//			attention.swingAnimator(viewContent);
	//			txtContent.setText("Class: Attention");
	//		}
	//		if (viewContent.equals("TadaAnimator"))
	//		{
	//			attention.tadaAnimator(viewContent);
	//			txtContent.setText("Class: Attention");
	//		}
	//		if (viewContent.equals("WaveAnimator"))
	//		{
	//			attention.waveAnimator(viewContent);
	//			txtContent.setText("Class: Attention");
	//		}
	//		if (viewContent.equals("WobbleAnimator"))
	//		{
	//			attention.wobbleAnimator(viewContent);
	//			txtContent.setText("Class: Attention");
	//		}
	//	}
	
	@Override
	public int getItemCount()
	{
		return arrayAnimation.length;
	}
	
	public class RecyclerViewHolder extends RecyclerView.ViewHolder
	{
		
		public TextView txtAnimation;
		
		public RecyclerViewHolder(View itemView)
		{
			super(itemView);
			txtAnimation = (TextView) itemView.findViewById(R.id.txtAnimation);
		}
	}
}