package ru.mif.fortunewheel.dto.data;

import ru.mif.fortunewheel.dto.Data;

import java.util.Collection;

public class PageData<T extends Data<?, ?>> {
    private final int number;
    private final int size;
    private final int totalPages;
    private final int totalCount;
    private final Collection<T> items;

    public PageData(int number, int size, int totalPages, int totalCount, Collection<T> items) {
        this.number = number;
        this.size = size;
        this.totalPages = totalPages;
        this.totalCount = totalCount;
        this.items = items;
    }

    public int getNumber() {
        return number;
    }

    public int getSize() {
        return size;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public Collection<T> getItems() {
        return items;
    }
}
