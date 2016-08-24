package android.simpleanimation.com;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

/**
 * Created by lili on 2016/3/15.
 */
public class BouncingEntrances
{
	public void bounceInAnimator(View view)
	{
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(view, "alpha", 0, 1, 1, 1),
							   ObjectAnimator.ofFloat(view, "scaleX", 0.3f, 1.05f, 0.9f, 1),
							   ObjectAnimator.ofFloat(view, "scaleY", 0.3f, 1.05f, 0.9f, 1));

		animSetXY.start();
	}

	public void bounceInDownAnimator(View view)
	{
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(view, "alpha", 0, 1, 1, 1), ObjectAnimator
				.ofFloat(view, "translationY", -view.getHeight(), 30, -10, 0));

		animSetXY.start();
	}

	public void bounceInLeftAnimator(View view)
	{
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(
				ObjectAnimator.ofFloat(view, "translationX", -view.getWidth(), 30, -10, 0),
				ObjectAnimator.ofFloat(view, "alpha", 0, 1, 1, 1));

		animSetXY.start();
	}

	public void bounceInRightAnimator(View view)
	{
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(view, "translationX",
													  view.getMeasuredWidth() + view.getWidth(),
													  -30, 10, 0),
							   ObjectAnimator.ofFloat(view, "alpha", 0, 1, 1, 1));

		animSetXY.start();
	}

	public void bounceInUpAnimator(View view)
	{
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(
				ObjectAnimator.ofFloat(view, "translationY", view.getMeasuredHeight(), -30, 10, 0),
				ObjectAnimator.ofFloat(view, "alpha", 0, 1, 1, 1));

		animSetXY.start();
	}
}
