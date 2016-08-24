package android.simpleanimation.com;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

/**
 * Created by lili on 2016/3/15.
 */
public class RotatingEntrances
{

	public void rotateInAnimator(View view)
	{

		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(view, "rotation", -200, 0),
							   ObjectAnimator.ofFloat(view, "alpha", 0, 1));

		animSetXY.start();
	}

	public void rotateInDownLeftAnimator(View view)
	{
		float x = view.getPaddingLeft();
		float y = view.getHeight() - view.getPaddingBottom();
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(view, "rotation", -90, 0),
							   ObjectAnimator.ofFloat(view, "alpha", 0, 1),
							   ObjectAnimator.ofFloat(view, "pivotX", x, x),
							   ObjectAnimator.ofFloat(view, "pivotY", y, y));

		animSetXY.start();
	}

	public void rotateInDownRightAnimator(View view)
	{
		float x = view.getWidth() - view.getPaddingRight();
		float y = view.getHeight() - view.getPaddingBottom();

		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(view, "rotation", 90, 0),
							   ObjectAnimator.ofFloat(view, "alpha", 0, 1),
							   ObjectAnimator.ofFloat(view, "pivotX", x, x),
							   ObjectAnimator.ofFloat(view, "pivotY", y, y));

		animSetXY.start();
	}

	public void rotateInUpLeftAnimator(View view)
	{
		float x = view.getPaddingLeft();
		float y = view.getHeight() - view.getPaddingBottom();
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(view, "rotation", 90, 0),
							   ObjectAnimator.ofFloat(view, "alpha", 0, 1),
							   ObjectAnimator.ofFloat(view, "pivotX", x, x),
							   ObjectAnimator.ofFloat(view, "pivotY", y, y));

		animSetXY.start();
	}

	public void rotateInUpRightAnimator(View view)
	{

		float x = view.getWidth() - view.getPaddingRight();
		float y = view.getHeight() - view.getPaddingBottom();
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(view, "rotation", -90, 0),
							   ObjectAnimator.ofFloat(view, "alpha", 0, 1),
							   ObjectAnimator.ofFloat(view, "pivotX", x, x),
							   ObjectAnimator.ofFloat(view, "pivotY", y, y));

		animSetXY.start();
	}
}
