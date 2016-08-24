package android.simpleanimation.com;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

/**
 * Created by lili on 2016/3/15.
 */
public class Attention
{
	public void bounceAnimator(View view)
	{
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(
				ObjectAnimator.ofFloat(view, "translationY", 0, 0, -30, 0, -15, 0, 0));
		animSetXY.start();
	}

	public void flashAnimator(View view)
	{
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(view, "alpha", 1, 0, 1, 0, 1));
		animSetXY.start();
	}

	public void pulseAnimator(View view)
	{
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(view, "scaleY", 1, 1.1f, 1));
		animSetXY.playTogether(ObjectAnimator.ofFloat(view, "scaleX", 1, 1.1f, 1));
		animSetXY.start();
	}

	public void standUpAnimator(View view)
	{
		float x = (view.getWidth() - view.getPaddingLeft() - view.getPaddingRight()) / 2 + view
				.getPaddingLeft();
		float y = view.getHeight() - view.getPaddingBottom();

		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(view, "pivotX", x, x, x, x, x));
		animSetXY.playTogether(ObjectAnimator.ofFloat(view, "pivotY", y, y, y, y, y));
		animSetXY.playTogether(ObjectAnimator.ofFloat(view, "rotationX", 55, -30, 15, -15, 0));
		animSetXY.start();
	}

	public void swingAnimator(View view)
	{
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(
				ObjectAnimator.ofFloat(view, "rotation", 0, 10, -10, 6, -6, 3, -3, 0));
		animSetXY.start();
	}

	public void tadaAnimator(View view)
	{
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator
									   .ofFloat(view, "scaleX", 1, 0.9f, 0.9f, 1.1f, 1.1f, 1.1f,
												1.1f, 1.1f, 1.1f, 1));
		animSetXY.playTogether(ObjectAnimator
									   .ofFloat(view, "scaleY", 1, 0.9f, 0.9f, 1.1f, 1.1f, 1.1f,
												1.1f, 1.1f, 1.1f, 1));
		animSetXY.playTogether(
				ObjectAnimator.ofFloat(view, "rotation", 0, -3, -3, 3, -3, 3, -3, 3, -3, 0));
		animSetXY.start();
	}

	public void waveAnimator(View view)
	{
		float x = (view.getWidth() - view.getPaddingLeft() - view.getPaddingRight()) / 2 + view
				.getPaddingLeft();
		float y = view.getHeight() - view.getPaddingBottom();
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(view, "rotation", 12, -12, 3, -3, 0),
							   ObjectAnimator.ofFloat(view, "pivotX", x, x, x, x, x),
							   ObjectAnimator.ofFloat(view, "pivotY", y, y, y, y, y));

		animSetXY.start();
	}

	public void wobbleAnimator(View view)
	{
		float width = view.getWidth();
		float one = (float) (width / 100.0);
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator
									   .ofFloat(view, "translationX", 0 * one, -25 * one, 20 * one,
												-15 * one, 10 * one, -5 * one, 0 * one, 0),
							   ObjectAnimator.ofFloat(view, "rotation", 0, -5, 3, -3, 2, -1, 0));

		animSetXY.start();
	}
}
