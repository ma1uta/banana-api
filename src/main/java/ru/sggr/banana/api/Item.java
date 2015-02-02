package ru.sggr.banana.api;

import org.checkerframework.checker.nullness.qual.NonNull;

import java.time.ZonedDateTime;

/**
 * Item
 *
 * @author tolya
 * @since 02.02.15.
 */
public interface Item {

    /**
     * Unique identifier of the Item
     *
     * @return Item identifier
     */
    @NonNull String getItemId();

    /**
     * Unique identifier of the retriever which take this Item
     *
     * @return retriever identifier
     */
    @NonNull String getRetrieverId();

    /**
     * Date with timezones when this Item had been retrieved
     *
     * @return date
     */
    @NonNull ZonedDateTime getRetrieveDate();

    /**
     * Data of this Item
     *
     * @return Data
     */
    @NonNull Object getData();
}
