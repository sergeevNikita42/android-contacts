package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import ru.yandex.practicum.contacts.presentation.filter.model.FilterContactTypeUi;

public interface ListDiffInterface<T> {
    boolean theSameAs(T other);
    boolean equals(Object object);
}
