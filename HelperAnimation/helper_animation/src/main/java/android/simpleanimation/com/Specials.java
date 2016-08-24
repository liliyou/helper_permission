package android.simpleanimation.com;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by lili on 2016/3/15.
 */
public class Specials
{

	//	public void HingeAnimator(View target)
	//	{
	////		float x = target.getPaddingLeft();
	////		float y = target.getPaddingTop();
	////
	////		ViewGroup parent = (ViewGroup) target.getParent();
	////		AnimatorSet animSetXY = new AnimatorSet();
	////		animSetXY.playTogether(
	////				Glider.glide(Skill.SineEaseInOut, 1300, ObjectAnimator.ofFloat(target,"rotation",0,80,60,80,60,60)),
	////				ObjectAnimator.ofFloat(target, "translationY", 0, 0, 0, 0, 0, 700),
	////				ObjectAnimator.ofFloat(target, "alpha", 1, 1, 1, 1, 1, 0),
	////				ObjectAnimator.ofFloat(target, "pivotX", x, x, x, x, x, x),
	////				ObjectAnimator.ofFloat(target, "pivotY", y, y, y, y, y, y)
	////		);
	////		setDuration(1300);
	////		animSetXY.start();
	//	}

	public void rollInAnimator(View target)
	{

		ViewGroup parent = (ViewGroup) target.getParent();
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(target, "alpha", 0, 1), ObjectAnimator
				.ofFloat(target, "translationX",
						 -(target.getWidth() - target.getPaddingLeft() - target.getPaddingRight()),
						 0), ObjectAnimator.ofFloat(target, "rotation", -120, 0));
		animSetXY.start();
	}

	public void rollOutAnimator(View target)
	{

		ViewGroup parent = (ViewGroup) target.getParent();
		AnimatorSet animSetXY = new AnimatorSet();
		animSetXY.playTogether(ObjectAnimator.ofFloat(target, "alpha", 1, 0),
							   ObjectAnimator.ofFloat(target, "translationX", 0, target.getWidth()),
							   ObjectAnimator.ofFloat(target, "rotation", 0, 120));
		animSetXY.start();
	}
}
