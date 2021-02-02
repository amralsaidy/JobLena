package com.joblena.presentation.components.skill;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001+B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0002J\u0018\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u001a\u0010\'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0018\u0010)\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0002J\b\u0010*\u001a\u00020\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\bR\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\bR \u0010\n\u001a\b\u0018\u00010\u000bR\u00020\u0000X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00070\u0012j\b\u0012\u0004\u0012\u00020\u0007`\u00130\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\bR\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\bR\u001e\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0012j\b\u0012\u0004\u0012\u00020\u0017`\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/joblena/presentation/components/skill/PickSkillFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/joblena/databinding/FragmentPickSkillBinding;", "educationSkills", "", "", "[Ljava/lang/String;", "experienceSkills", "mAdapter", "Lcom/joblena/presentation/components/skill/PickSkillFragment$SkillsPagerAdapter;", "getMAdapter", "()Lcom/joblena/presentation/components/skill/PickSkillFragment$SkillsPagerAdapter;", "setMAdapter", "(Lcom/joblena/presentation/components/skill/PickSkillFragment$SkillsPagerAdapter;)V", "pickedSkills", "Landroid/util/ArrayMap;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "softSkills", "technicalSkills", "textViews", "Landroid/widget/TextView;", "addToSelectedMap", "", "category", "child", "inflateLayoutWithFilters", "flexboxLayout", "Lcom/google/android/flexbox/FlexboxLayout;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "removeFromSelectedMap", "subSkills", "SkillsPagerAdapter", "app_debug"})
public final class PickSkillFragment extends androidx.fragment.app.Fragment {
    private android.util.ArrayMap<java.lang.String, java.util.ArrayList<java.lang.String>> pickedSkills;
    private java.util.ArrayList<android.widget.TextView> textViews;
    private java.lang.String[] educationSkills = {""};
    private java.lang.String[] experienceSkills = {""};
    private java.lang.String[] technicalSkills = {""};
    private java.lang.String[] softSkills = {""};
    private com.joblena.databinding.FragmentPickSkillBinding binding;
    @org.jetbrains.annotations.Nullable()
    private com.joblena.presentation.components.skill.PickSkillFragment.SkillsPagerAdapter mAdapter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.joblena.presentation.components.skill.PickSkillFragment.SkillsPagerAdapter getMAdapter() {
        return null;
    }
    
    public final void setMAdapter(@org.jetbrains.annotations.Nullable()
    com.joblena.presentation.components.skill.PickSkillFragment.SkillsPagerAdapter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void inflateLayoutWithFilters(java.lang.String category, com.google.android.flexbox.FlexboxLayout flexboxLayout) {
    }
    
    private final void subSkills() {
    }
    
    private final void addToSelectedMap(java.lang.String category, java.lang.String child) {
    }
    
    private final void removeFromSelectedMap(java.lang.String category, java.lang.String child) {
    }
    
    public PickSkillFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0016\u00a8\u0006\u0011"}, d2 = {"Lcom/joblena/presentation/components/skill/PickSkillFragment$SkillsPagerAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "(Lcom/joblena/presentation/components/skill/PickSkillFragment;)V", "getCount", "", "getPageTitle", "", "position", "instantiateItem", "", "collection", "Landroid/view/ViewGroup;", "isViewFromObject", "", "view", "Landroid/view/View;", "object", "app_debug"})
    public final class SkillsPagerAdapter extends androidx.viewpager.widget.PagerAdapter {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.Object instantiateItem(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup collection, int position) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.CharSequence getPageTitle(int position) {
            return null;
        }
        
        @java.lang.Override()
        public boolean isViewFromObject(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        java.lang.Object object) {
            return false;
        }
        
        @java.lang.Override()
        public int getCount() {
            return 0;
        }
        
        public SkillsPagerAdapter() {
            super();
        }
    }
}