package com.joblena;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.joblena.databinding.ActivityHostBindingImpl;
import com.joblena.databinding.ActivityJobBindingImpl;
import com.joblena.databinding.ActivitySkillBindingImpl;
import com.joblena.databinding.FragmentAuthBindingImpl;
import com.joblena.databinding.FragmentAuthCodeBindingImpl;
import com.joblena.databinding.FragmentHome2BindingImpl;
import com.joblena.databinding.FragmentHomeBindingImpl;
import com.joblena.databinding.FragmentPickSkillBindingImpl;
import com.joblena.databinding.FragmentPickedSkillBindingImpl;
import com.joblena.databinding.FragmentSignupBusinessBindingImpl;
import com.joblena.databinding.FragmentSignupPersonalBindingImpl;
import com.joblena.databinding.FragmentSplashBindingImpl;
import com.joblena.databinding.FragmentWelcomeBindingImpl;
import com.joblena.databinding.ItemChipBindingImpl;
import com.joblena.databinding.ItemSkillBindingImpl;
import com.joblena.databinding.JobItemListBindingImpl;
import com.joblena.databinding.JobNameListItemBindingImpl;
import com.joblena.databinding.LayoutChipsContainerBindingImpl;
import com.joblena.databinding.SkillListItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Generated;

@Generated("Android Data Binding")
public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYHOST = 1;

  private static final int LAYOUT_ACTIVITYJOB = 2;

  private static final int LAYOUT_ACTIVITYSKILL = 3;

  private static final int LAYOUT_FRAGMENTAUTH = 4;

  private static final int LAYOUT_FRAGMENTAUTHCODE = 5;

  private static final int LAYOUT_FRAGMENTHOME = 6;

  private static final int LAYOUT_FRAGMENTHOME2 = 7;

  private static final int LAYOUT_FRAGMENTPICKSKILL = 8;

  private static final int LAYOUT_FRAGMENTPICKEDSKILL = 9;

  private static final int LAYOUT_FRAGMENTSIGNUPBUSINESS = 10;

  private static final int LAYOUT_FRAGMENTSIGNUPPERSONAL = 11;

  private static final int LAYOUT_FRAGMENTSPLASH = 12;

  private static final int LAYOUT_FRAGMENTWELCOME = 13;

  private static final int LAYOUT_ITEMCHIP = 14;

  private static final int LAYOUT_ITEMSKILL = 15;

  private static final int LAYOUT_JOBITEMLIST = 16;

  private static final int LAYOUT_JOBNAMELISTITEM = 17;

  private static final int LAYOUT_LAYOUTCHIPSCONTAINER = 18;

  private static final int LAYOUT_SKILLLISTITEM = 19;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(19);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.joblena.R.layout.activity_host, LAYOUT_ACTIVITYHOST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.joblena.R.layout.activity_job, LAYOUT_ACTIVITYJOB);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.joblena.R.layout.activity_skill, LAYOUT_ACTIVITYSKILL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.joblena.R.layout.fragment_auth, LAYOUT_FRAGMENTAUTH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.joblena.R.layout.fragment_auth_code, LAYOUT_FRAGMENTAUTHCODE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.joblena.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.joblena.R.layout.fragment_home2, LAYOUT_FRAGMENTHOME2);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.joblena.R.layout.fragment_pick_skill, LAYOUT_FRAGMENTPICKSKILL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.joblena.R.layout.fragment_picked_skill, LAYOUT_FRAGMENTPICKEDSKILL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.joblena.R.layout.fragment_signup_business, LAYOUT_FRAGMENTSIGNUPBUSINESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.joblena.R.layout.fragment_signup_personal, LAYOUT_FRAGMENTSIGNUPPERSONAL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.joblena.R.layout.fragment_splash, LAYOUT_FRAGMENTSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.joblena.R.layout.fragment_welcome, LAYOUT_FRAGMENTWELCOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.joblena.R.layout.item_chip, LAYOUT_ITEMCHIP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.joblena.R.layout.item_skill, LAYOUT_ITEMSKILL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.joblena.R.layout.job_item_list, LAYOUT_JOBITEMLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.joblena.R.layout.job_name_list_item, LAYOUT_JOBNAMELISTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.joblena.R.layout.layout_chips_container, LAYOUT_LAYOUTCHIPSCONTAINER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.joblena.R.layout.skill_list_item, LAYOUT_SKILLLISTITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYHOST: {
          if ("layout/activity_host_0".equals(tag)) {
            return new ActivityHostBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_host is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYJOB: {
          if ("layout/activity_job_0".equals(tag)) {
            return new ActivityJobBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_job is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSKILL: {
          if ("layout/activity_skill_0".equals(tag)) {
            return new ActivitySkillBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_skill is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTAUTH: {
          if ("layout/fragment_auth_0".equals(tag)) {
            return new FragmentAuthBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_auth is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTAUTHCODE: {
          if ("layout/fragment_auth_code_0".equals(tag)) {
            return new FragmentAuthCodeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_auth_code is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME2: {
          if ("layout/fragment_home2_0".equals(tag)) {
            return new FragmentHome2BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home2 is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPICKSKILL: {
          if ("layout/fragment_pick_skill_0".equals(tag)) {
            return new FragmentPickSkillBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_pick_skill is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPICKEDSKILL: {
          if ("layout/fragment_picked_skill_0".equals(tag)) {
            return new FragmentPickedSkillBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_picked_skill is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSIGNUPBUSINESS: {
          if ("layout/fragment_signup_business_0".equals(tag)) {
            return new FragmentSignupBusinessBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_signup_business is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSIGNUPPERSONAL: {
          if ("layout/fragment_signup_personal_0".equals(tag)) {
            return new FragmentSignupPersonalBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_signup_personal is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSPLASH: {
          if ("layout/fragment_splash_0".equals(tag)) {
            return new FragmentSplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTWELCOME: {
          if ("layout/fragment_welcome_0".equals(tag)) {
            return new FragmentWelcomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_welcome is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCHIP: {
          if ("layout/item_chip_0".equals(tag)) {
            return new ItemChipBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_chip is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSKILL: {
          if ("layout/item_skill_0".equals(tag)) {
            return new ItemSkillBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_skill is invalid. Received: " + tag);
        }
        case  LAYOUT_JOBITEMLIST: {
          if ("layout/job_item_list_0".equals(tag)) {
            return new JobItemListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for job_item_list is invalid. Received: " + tag);
        }
        case  LAYOUT_JOBNAMELISTITEM: {
          if ("layout/job_name_list_item_0".equals(tag)) {
            return new JobNameListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for job_name_list_item is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTCHIPSCONTAINER: {
          if ("layout/layout_chips_container_0".equals(tag)) {
            return new LayoutChipsContainerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_chips_container is invalid. Received: " + tag);
        }
        case  LAYOUT_SKILLLISTITEM: {
          if ("layout/skill_list_item_0".equals(tag)) {
            return new SkillListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for skill_list_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "jobdetail");
      sKeys.put(2, "jobname");
      sKeys.put(3, "skill");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(19);

    static {
      sKeys.put("layout/activity_host_0", com.joblena.R.layout.activity_host);
      sKeys.put("layout/activity_job_0", com.joblena.R.layout.activity_job);
      sKeys.put("layout/activity_skill_0", com.joblena.R.layout.activity_skill);
      sKeys.put("layout/fragment_auth_0", com.joblena.R.layout.fragment_auth);
      sKeys.put("layout/fragment_auth_code_0", com.joblena.R.layout.fragment_auth_code);
      sKeys.put("layout/fragment_home_0", com.joblena.R.layout.fragment_home);
      sKeys.put("layout/fragment_home2_0", com.joblena.R.layout.fragment_home2);
      sKeys.put("layout/fragment_pick_skill_0", com.joblena.R.layout.fragment_pick_skill);
      sKeys.put("layout/fragment_picked_skill_0", com.joblena.R.layout.fragment_picked_skill);
      sKeys.put("layout/fragment_signup_business_0", com.joblena.R.layout.fragment_signup_business);
      sKeys.put("layout/fragment_signup_personal_0", com.joblena.R.layout.fragment_signup_personal);
      sKeys.put("layout/fragment_splash_0", com.joblena.R.layout.fragment_splash);
      sKeys.put("layout/fragment_welcome_0", com.joblena.R.layout.fragment_welcome);
      sKeys.put("layout/item_chip_0", com.joblena.R.layout.item_chip);
      sKeys.put("layout/item_skill_0", com.joblena.R.layout.item_skill);
      sKeys.put("layout/job_item_list_0", com.joblena.R.layout.job_item_list);
      sKeys.put("layout/job_name_list_item_0", com.joblena.R.layout.job_name_list_item);
      sKeys.put("layout/layout_chips_container_0", com.joblena.R.layout.layout_chips_container);
      sKeys.put("layout/skill_list_item_0", com.joblena.R.layout.skill_list_item);
    }
  }
}
