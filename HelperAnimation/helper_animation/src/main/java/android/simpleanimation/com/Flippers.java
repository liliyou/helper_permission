package android.simpleanimation.com;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

/**
 * Created by lili on 2016/3/15.
 */
public class Flippers
{
	public void flipInXAnimator(View view)
	{

		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(view, "rotationX", 90, -15, 15, 0),
							   ObjectAnimator.ofFloat(view, "alpha", 0.25f, 0.5f, 0.75f, 1));

		animSetXY.start();
	}

	public void flipInYAnimator(View view)
	{

		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(view, "rotationY", 90, -15, 15, 0),
							   ObjectAnimator.ofFloat(view, "alpha", 0.25f, 0.5f, 0.75f, 1));

		animSetXY.start();
	}

	public void flipOutXAnimator(View view)
	{

		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(view, "rotationX", 0, 90),
							   ObjectAnimator.ofFloat(view, "alpha", 1, 0));

		animSetXY.start();
	}

	public void flipOutYAnimator(View view)
	{

		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(view, "rotationY", 0, 90),
							   ObjectAnimator.ofFloat(view, "alpha", 1, 0));

		animSetXY.start();
	}
}
