# helper_permission
為 android 權限問題所做的套件。


使用方式：

app gradle=>

```
allprojects {
    repositories {
        jcenter()
        maven {
            url 'https://dl.bintray.com/liliyou/maven'

        }
    }
}
```
gradle=>
 ```
dependencies {
compile 'com.library.lili.helper_permission:helper_permission:1.0.1'
}
```

呼叫方式：

```
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
				//有權限後做什麼
					whenHasPermission();
				}

				@Override
				public void onFail()
				{

				}
			};
			String[] permissionArray = new String[]{
					Manifest.permission.WRITE_EXTERNAL_STORAGE};//把要檢查的權限寫在這裡（可以多個）
			permissionSetting.setPermission(permissionArray, permissionsResultListener);
			PermissionSetting.getToCheck(this, permissionSetting);
		}
		else
		{
			whenHasPermission();
		}
	}
```
AndroidManifest.xml
需增加對應的權限
```
	<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
```
