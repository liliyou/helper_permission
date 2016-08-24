package android.simpleanimation.com;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

/**
 * Created by lili on 2016/3/15.
 */
public class FadingEntrances
{
	public void fadeInAnimator(View view)
	{

		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(view, "alpha", 0, 1));
		animSetXY.start();
	}

	public void fadeInDownAnimator(View view)
	{

		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(view, "alpha", 0, 1), ObjectAnimator
				.ofFloat(view, "translationY", -view.getHeight() / 4, 0));

		animSetXY.start();
	}

	public void fadeInLeftAnimator(View view)
	{

		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(view, "alpha", 0, 1), ObjectAnimator
				.ofFloat(view, "translationX", -view.getWidth() / 4, 0));

		animSetXY.start();
	}

	public void fadeInRightAnimator(View view)
	{

		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(view, "alpha", 0, 1), ObjectAnimator
				.ofFloat(view, "translationX", view.getWidth() / 4, 0));

		animSetXY.start();
	}

	public void fadeInUpAnimator(View view)
	{

		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(view, "alpha", 0, 1), ObjectAnimator
				.ofFloat(view, "translationY", view.getHeight() / 4, 0));

		animSetXY.start();
	}
}
