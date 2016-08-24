package android.simpleanimation.com;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by lili on 2016/3/15.
 */
public class Sliders
{

	public void slideInDownAnimate(View view)
	{

		ViewGroup parent = (ViewGroup) view.getParent();
		int distance = parent.getHeight() - view.getTop();
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(view, "alpha", 0, 1),
							   ObjectAnimator.ofFloat(view, "translationY", -distance, 0));

		animSetXY.start();
	}

	public void slideInLeftAnimator(View target)
	{

		ViewGroup parent = (ViewGroup) target.getParent();
		int distance = parent.getWidth() - target.getLeft();
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(target, "alpha", 0, 1),
							   ObjectAnimator.ofFloat(target, "translationX", -distance, 0)

		);
		animSetXY.start();
	}

	public void slideInRightAnimator(View target)
	{
		ViewGroup parent = (ViewGroup) target.getParent();
		int distance = parent.getWidth() - target.getLeft();
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(target, "alpha", 0, 1),
							   ObjectAnimator.ofFloat(target, "translationX", distance, 0)

		);
		animSetXY.start();
	}

	public void slideInUpAnimator(View view)
	{

		ViewGroup parent = (ViewGroup) view.getParent();
		int distance = parent.getHeight() - view.getTop();
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(view, "alpha", 0, 1),
							   ObjectAnimator.ofFloat(view, "translationY", distance, 0));
		animSetXY.start();
	}

	public void slideInDownFromAnimate(View preView, View view)
	{

		int distance = preView.getHeight() - view.getTop();
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(view, "alpha", 0, 1),
							   ObjectAnimator.ofFloat(view, "translationY", -distance, 0));

		animSetXY.start();
	}

	public void slideInUpAnimate(View view)
	{

		ViewGroup parent = (ViewGroup) view.getParent();
		int distance = parent.getHeight() - view.getTop();
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(view, "alpha", 0, 1),
							   ObjectAnimator.ofFloat(view, "translationY", distance, 0));

		animSetXY.start();
	}

	public void slideOutDownAnimator(View target)
	{

		ViewGroup parent = (ViewGroup) target.getParent();
		int distance = parent.getHeight() - target.getTop();
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(target, "alpha", 1, 0),
							   ObjectAnimator.ofFloat(target, "translationY", 0, distance));

		animSetXY.start();
	}

	public void slideOutLeftAnimator(View target)
	{

		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(target, "alpha", 1, 0), ObjectAnimator
				.ofFloat(target, "translationX", 0, -target.getRight()));

		animSetXY.start();
	}

	public void slideOutRightAnimator(View target)
	{

		ViewGroup parent = (ViewGroup) target.getParent();
		int distance = parent.getWidth() - target.getLeft();
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(target, "alpha", 1, 0),
							   ObjectAnimator.ofFloat(target, "translationX", 0, distance));

		animSetXY.start();
	}

	public void slideOutUpAnimator(View target)
	{

		ViewGroup parent = (ViewGroup) target.getParent();
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(target, "alpha", 1, 0), ObjectAnimator
				.ofFloat(target, "translationY", 0, -target.getBottom()));

		animSetXY.start();
	}
}
