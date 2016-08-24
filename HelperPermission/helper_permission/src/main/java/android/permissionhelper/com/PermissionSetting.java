package android.permissionhelper.com;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;

/**
 * Created by lili on 2016/3/29.
 */
public class PermissionSetting
{

	public static final int REQUEST_PERMISSION_0 = 0;

	private String[] permissionArray;
	private PermissionsResultListener permissionsResultListener;
	private Activity activity;

	public static void getToCheck(Activity activity, PermissionSetting permissionSetting)
	{
		PermissionActivity.setPermissionSetting(permissionSetting);
		Intent intent = new Intent(activity, PermissionActivity.class);
		activity.startActivity(intent);
	}

	public void setActivity(Activity activity)
	{
		this.activity = activity;
	}

	public void setPermission(String[] permissionArray,
							  PermissionsResultListener permissionsResultListener)
	{
		if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M)
		{
			if (permissionArray != null)
			{
				this.permissionArray = permissionArray;
			}
			else
			{
				this.permissionArray = new String[]{
						Manifest.permission.WRITE_EXTERNAL_STORAGE,
						android.Manifest.permission.ACCESS_FINE_LOCATION};
			}
			if (permissionsResultListener != null)
			{
				this.permissionsResultListener = permissionsResultListener;
			}
		}
	}

	public void checkAndRequestPermission()
	{

		Boolean hasPermission = true;
		for (String strPermission : permissionArray)
		{
			int permission = ActivityCompat.checkSelfPermission(activity, strPermission);
			if (permission != PackageManager.PERMISSION_GRANTED)
			{
				hasPermission = false;
			}
		}
		if (!hasPermission)
		{
			ActivityCompat.requestPermissions(activity, permissionArray, REQUEST_PERMISSION_0);
		}
	}

	public Boolean hasToCheckPermission()
	{
		if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public Boolean checkPermission()
	{
		if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M)
		{
			Boolean hasPermission = true;
			for (String strPermission : permissionArray)
			{
				int permission = ActivityCompat.checkSelfPermission(activity, strPermission);
				if (permission != PackageManager.PERMISSION_GRANTED)
				{
					hasPermission = false;
				}
			}
			return hasPermission;
		}
		else
		{
			return true;
		}
	}

	public void onRequestPermissionsResult(int requestCode, String[] permissions,
										   int[] grantResults)
	{
		switch (requestCode)
		{
			case REQUEST_PERMISSION_0:
				Boolean hasPermission = true;
				if (grantResults.length > 0)
				{
					for (int grantResult : grantResults)
					{
						if (grantResult != PackageManager.PERMISSION_GRANTED)
						{
							hasPermission = false;
						}
					}
				}
				if (permissionsResultListener != null)
				{
					if (!hasPermission)
					{
						permissionsResultListener.onFail();
					}
					else
					{
						permissionsResultListener.onAllSuccess();
					}
				}
				activity.finish();
				break;
		}
	}

	public void permissionsAllSuccess()
	{
		permissionsResultListener.onAllSuccess();
		activity.finish();
	}

	public interface PermissionsResultListener
	{
		void onAllSuccess();

		void onFail();
	}
}
