package ru.sggr.banana.api;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.time.ZonedDateTime;

/**
 * Some logic for retrieve Items from sites
 *
 * @author tolya
 * @since 02.02.15.
 */
public interface Retriever {

    /**
     * Retrieve new Items.
     *
     * @param queue           queue to which retriever will push new items
     * @param lastUpdatedDate retrieve new items from this date
     * @param itemIds         identifiers for Item for retrieve or parameters for new Items
     */
    void retrieve(@NonNull Queue queue, @Nullable ZonedDateTime lastUpdatedDate, @Nullable String... itemIds);
}
