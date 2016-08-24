package android.helperpermission.com;

import android.Manifest;
import android.os.Bundle;
import android.permissionhelper.com.PermissionSetting;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		checkUUIDPermission();
	}

	private void whenHasPermission()
	{

	}

	private void checkUUIDPermission()
	{
		PermissionSetting permissionSetting = new PermissionSetting();
		permissionSetting.setActivity(this);
		if (permissionSetting.hasToCheckPermission())
		{
			PermissionSetting.PermissionsResultListener permissionsResultListener = new PermissionSetting.PermissionsResultListener()
			{
				@Override
				public void onAllSuccess()
				{
					whenHasPermission();
				}

				@Override
				public void onFail()
				{

				}
			};
			String[] permissionArray = new String[]{
					Manifest.permission.WRITE_EXTERNAL_STORAGE};
			permissionSetting.setPermission(permissionArray, permissionsResultListener);
			PermissionSetting.getToCheck(this, permissionSetting);
		}
		else
		{
			whenHasPermission();
		}
	}
}
