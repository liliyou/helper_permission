package android.simpleanimation.com;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

/**
 * Created by lili on 2016/3/15.
 */
public class RotatingExits
{
	public void rotateOutAnimator(View view)
	{

		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(view, "alpha", 1, 0),
							   ObjectAnimator.ofFloat(view, "rotation", 0, 200));

		animSetXY.start();
	}

	public void rotateOutDownLeftAnimator(View view)
	{
		float x = view.getPaddingLeft();
		float y = view.getHeight() - view.getPaddingBottom();
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(view, "alpha", 1, 0),
							   ObjectAnimator.ofFloat(view, "rotation", 0, 90),
							   ObjectAnimator.ofFloat(view, "pivotX", x, x),
							   ObjectAnimator.ofFloat(view, "pivotY", y, y));

		animSetXY.start();
	}

	public void rotateOutDownRightAnimator(View view)
	{
		float x = view.getWidth() - view.getPaddingRight();
		float y = view.getHeight() - view.getPaddingBottom();
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(view, "alpha", 1, 0),
							   ObjectAnimator.ofFloat(view, "rotation", 0, -90),
							   ObjectAnimator.ofFloat(view, "pivotX", x, x),
							   ObjectAnimator.ofFloat(view, "pivotY", y, y));

		animSetXY.start();
	}

	public void rotateOutUpLeftAnimator(View view)
	{
		float x = view.getPaddingLeft();
		float y = view.getHeight() - view.getPaddingBottom();
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(view, "alpha", 1, 0),
							   ObjectAnimator.ofFloat(view, "rotation", 0, -90),
							   ObjectAnimator.ofFloat(view, "pivotX", x, x),
							   ObjectAnimator.ofFloat(view, "pivotY", y, y));

		animSetXY.start();
	}

	public void rotateOutUpRightAnimator(View view)
	{

		float x = view.getWidth() - view.getPaddingRight();
		float y = view.getHeight() - view.getPaddingBottom();
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(view, "alpha", 1, 0),
							   ObjectAnimator.ofFloat(view, "rotation", 0, 90),
							   ObjectAnimator.ofFloat(view, "pivotX", x, x),
							   ObjectAnimator.ofFloat(view, "pivotY", y, y));
		animSetXY.start();
	}
}
