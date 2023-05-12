package com.hkct.project.Model;

import com.google.firebase.firestore.Exclude;

import org.checkerframework.checker.nullness.qual.NonNull;

public class ProductId {
    @Exclude
        public String ProductId;

    public <T extends ProductId> T withId (@NonNull final String id) {
        this.ProductId = id;
        return (T) this;
    }
}
