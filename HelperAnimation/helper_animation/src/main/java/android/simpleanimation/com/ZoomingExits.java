package android.simpleanimation.com;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by lili on 2016/3/15.
 */
public class ZoomingExits
{

	public void zoomOutAnimator(View target)
	{

		ViewGroup parent = (ViewGroup) target.getParent();
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(target, "alpha", 1, 0, 0),
							   ObjectAnimator.ofFloat(target, "scaleX", 1, 0.3f, 0),
							   ObjectAnimator.ofFloat(target, "scaleY", 1, 0.3f, 0));
		animSetXY.start();
	}

	public void zoomOutDownAnimator(View target)
	{

		ViewGroup parent = (ViewGroup) target.getParent();
		int distance = parent.getHeight() - target.getTop();
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(target, "alpha", 1, 1, 0),
							   ObjectAnimator.ofFloat(target, "scaleX", 1, 0.475f, 0.1f),
							   ObjectAnimator.ofFloat(target, "scaleY", 1, 0.475f, 0.1f),
							   ObjectAnimator.ofFloat(target, "translationY", 0, -60, distance));
		animSetXY.start();
	}

	public void zoomOutLeftAnimator(View target)
	{
		ViewGroup parent = (ViewGroup) target.getParent();
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(target, "alpha", 1, 1, 0),
							   ObjectAnimator.ofFloat(target, "scaleX", 1, 0.475f, 0.1f),
							   ObjectAnimator.ofFloat(target, "scaleY", 1, 0.475f, 0.1f),
							   ObjectAnimator
									   .ofFloat(target, "translationX", 0, 42, -target.getRight()));
		animSetXY.start();
	}

	public void zoomOutRightAnimator(View target)
	{
		ViewGroup parent = (ViewGroup) target.getParent();
		int distance = parent.getWidth() - parent.getLeft();
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(target, "alpha", 1, 1, 0),
							   ObjectAnimator.ofFloat(target, "scaleX", 1, 0.475f, 0.1f),
							   ObjectAnimator.ofFloat(target, "scaleY", 1, 0.475f, 0.1f),
							   ObjectAnimator.ofFloat(target, "translationX", 0, -42, distance));
		animSetXY.start();
	}

	public void zoomOutUpAnimator(View target)
	{
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(target, "alpha", 1, 1, 0),
							   ObjectAnimator.ofFloat(target, "scaleX", 1, 0.475f, 0.1f),
							   ObjectAnimator.ofFloat(target, "scaleY", 1, 0.475f, 0.1f),
							   ObjectAnimator.ofFloat(target, "translationY", 0, 60,
													  -target.getBottom()));
		animSetXY.start();
	}
}
