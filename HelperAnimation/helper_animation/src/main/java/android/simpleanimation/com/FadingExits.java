package android.simpleanimation.com;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

/**
 * Created by lili on 2016/3/15.
 */
public class FadingExits
{

	public void fadeOutAnimator(View view)
	{

		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(view, "alpha", 1, 0));

		animSetXY.start();
	}

	public void fadeOutDownAnimator(View view)
	{

		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(view, "alpha", 1, 0), ObjectAnimator
				.ofFloat(view, "translationY", 0, view.getHeight() / 4));

		animSetXY.start();
	}

	public void fadeOutLeftAnimator(View view)
	{

		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(view, "alpha", 1, 0), ObjectAnimator
				.ofFloat(view, "translationX", 0, -view.getWidth() / 4));

		animSetXY.start();
	}

	public void fadeOutRightAnimator(View view)
	{

		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(view, "alpha", 1, 0), ObjectAnimator
				.ofFloat(view, "translationX", 0, view.getWidth() / 4));

		animSetXY.start();
	}

	public void fadeOutUpAnimator(View view)
	{

		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(view, "alpha", 1, 0), ObjectAnimator
				.ofFloat(view, "translationY", 0, -view.getHeight() / 4));

		animSetXY.start();
	}
}
