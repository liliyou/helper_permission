package android.simpleanimation.com;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by lili on 2016/3/15.
 */
public class ZoomingEntrances
{
	public void zoomInAnimator(View target)
	{

		ViewGroup parent = (ViewGroup) target.getParent();
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(target, "scaleX", 0.45f, 1),
							   ObjectAnimator.ofFloat(target, "scaleY", 0.45f, 1),
							   ObjectAnimator.ofFloat(target, "alpha", 0, 1));
		animSetXY.start();
	}

	public void zoomInDownAnimator(View target)
	{

		ViewGroup parent = (ViewGroup) target.getParent();
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(target, "scaleX", 0.1f, 0.475f, 1),
							   ObjectAnimator.ofFloat(target, "scaleY", 0.1f, 0.475f, 1),
							   ObjectAnimator
									   .ofFloat(target, "translationY", -target.getBottom(), 60, 0),
							   ObjectAnimator.ofFloat(target, "alpha", 0, 1, 1));
		animSetXY.start();
	}

	public void zoomInLeftAnimator(View target)
	{

		ViewGroup parent = (ViewGroup) target.getParent();
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(target, "scaleX", 0.1f, 0.475f, 1),
							   ObjectAnimator.ofFloat(target, "scaleY", 0.1f, 0.475f, 1),
							   ObjectAnimator
									   .ofFloat(target, "translationX", -target.getRight(), 48, 0),
							   ObjectAnimator.ofFloat(target, "alpha", 0, 1, 1));
		animSetXY.start();
	}

	public void zoomInRightAnimator(View target)
	{

		ViewGroup parent = (ViewGroup) target.getParent();
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(target, "scaleX", 0.1f, 0.475f, 1),
							   ObjectAnimator.ofFloat(target, "scaleY", 0.1f, 0.475f, 1),
							   ObjectAnimator.ofFloat(target, "translationX",
													  target.getWidth() + target.getPaddingRight(),
													  -48, 0),
							   ObjectAnimator.ofFloat(target, "alpha", 0, 1, 1));
		animSetXY.start();
	}

	public void zoomInUpAnimator(View target)
	{

		ViewGroup parent = (ViewGroup) target.getParent();
		int distance = parent.getHeight() - target.getTop();
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(target, "alpha", 0, 1, 1),
							   ObjectAnimator.ofFloat(target, "scaleX", 0.1f, 0.475f, 1),
							   ObjectAnimator.ofFloat(target, "scaleY", 0.1f, 0.475f, 1),
							   ObjectAnimator.ofFloat(target, "translationY", distance, -60, 0));
		animSetXY.start();
	}
}
