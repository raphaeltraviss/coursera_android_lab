package course.labs.permissionslab;

import android.provider.BaseColumns;

/**
 * Stand-in for Browser.BookmarkColumns, which was removed in
 * API version 23.
 * If you can't use Browser.BookmarkColumns for any reason,
 * then use BookmarkColumns instead.
 */
public class BookmarkColumns implements BaseColumns {
    public static final String URL = "url";
    public static final String VISITS = "visits";
    public static final String DATE = "date";
    public static final String BOOKMARK = "bookmark";
    public static final String TITLE = "title";
    public static final String CREATED = "created";
    public static final String FAVICON = "favicon";

    public static final String THUMBNAIL = "thumbnail";

    public static final String TOUCH_ICON = "touch_icon";

    public static final String USER_ENTERED = "user_entered";
}
