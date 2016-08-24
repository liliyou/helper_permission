package android.permissionhelper.com;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class PermissionActivity extends Activity
{

	public static PermissionSetting permissionSetting;

	public static void setPermissionSetting(PermissionSetting permissionSetting)
	{
		PermissionActivity.permissionSetting = permissionSetting;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.view_dialog_permission);
		setDate();
		WindowManager.LayoutParams params = getWindow().getAttributes();
		params.width = 1;
		params.height = 1;
		getWindow().setAttributes(params);
		getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
	}

	private void setDate()
	{
		if (permissionSetting != null)
		{
			permissionSetting.setActivity(PermissionActivity.this);
			if (permissionSetting.checkPermission())
			{
				permissionSetting.permissionsAllSuccess();
			}
			else
			{
				permissionSetting.checkAndRequestPermission();
			}
		}
	}

	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions,
										   int[] grantResults)
	{
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);

		if (permissionSetting != null)
		{
			permissionSetting.onRequestPermissionsResult(requestCode, permissions, grantResults);
		}
	}
}
