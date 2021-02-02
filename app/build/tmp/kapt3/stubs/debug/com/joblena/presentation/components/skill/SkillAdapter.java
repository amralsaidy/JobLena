package com.joblena.presentation.components.skill;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016J\u0014\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/joblena/presentation/components/skill/SkillAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/joblena/presentation/components/skill/SkillAdapter$SkillViewHolder;", "()V", "context", "Landroid/content/Context;", "skillBinding", "Lcom/joblena/databinding/ItemSkillBinding;", "skillList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateSkill", "childs", "", "SkillViewHolder", "app_debug"})
public final class SkillAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.joblena.presentation.components.skill.SkillAdapter.SkillViewHolder> {
    private final java.util.ArrayList<java.lang.String> skillList = null;
    private com.joblena.databinding.ItemSkillBinding skillBinding;
    private android.content.Context context;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.joblena.presentation.components.skill.SkillAdapter.SkillViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.joblena.presentation.components.skill.SkillAdapter.SkillViewHolder holder, int position) {
    }
    
    public final void updateSkill(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> childs) {
    }
    
    public SkillAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/joblena/presentation/components/skill/SkillAdapter$SkillViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/joblena/databinding/ItemSkillBinding;", "(Lcom/joblena/presentation/components/skill/SkillAdapter;Lcom/joblena/databinding/ItemSkillBinding;)V", "getBinding", "()Lcom/joblena/databinding/ItemSkillBinding;", "bind", "", "title", "", "app_debug"})
    public final class SkillViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.joblena.databinding.ItemSkillBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        java.lang.String title) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.joblena.databinding.ItemSkillBinding getBinding() {
            return null;
        }
        
        public SkillViewHolder(@org.jetbrains.annotations.NotNull()
        com.joblena.databinding.ItemSkillBinding binding) {
            super(null);
        }
    }
}