package ru.sggr.banana.api;

import org.checkerframework.checker.nullness.qual.NonNull;

/**
 * Queue where we can push Items to persist
 *
 * @author tolya
 * @since 02.02.15.
 */
public interface Queue {

    /**
     * Push Item to queue
     *
     * @param item pushed Item
     */
    void push(@NonNull Item item);
}
