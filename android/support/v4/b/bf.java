package android.support.v4.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;

class bf
  extends be
{
  public Intent a(Activity paramActivity)
  {
    Intent localIntent2 = bg.a(paramActivity);
    Intent localIntent1 = localIntent2;
    if (localIntent2 == null) {
      localIntent1 = b(paramActivity);
    }
    return localIntent1;
  }
  
  public String a(Context paramContext, ActivityInfo paramActivityInfo)
  {
    String str2 = bg.a(paramActivityInfo);
    String str1 = str2;
    if (str2 == null) {
      str1 = super.a(paramContext, paramActivityInfo);
    }
    return str1;
  }
  
  public boolean a(Activity paramActivity, Intent paramIntent)
  {
    return bg.a(paramActivity, paramIntent);
  }
  
  Intent b(Activity paramActivity)
  {
    return super.a(paramActivity);
  }
  
  public void b(Activity paramActivity, Intent paramIntent)
  {
    bg.b(paramActivity, paramIntent);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/b/bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */