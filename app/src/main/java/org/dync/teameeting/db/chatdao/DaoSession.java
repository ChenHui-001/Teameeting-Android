package org.dync.teameeting.db.chatdao;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig chatCacheEntityDaoConfig;

    private final ChatCacheEntityDao chatCacheEntityDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        chatCacheEntityDaoConfig = daoConfigMap.get(ChatCacheEntityDao.class).clone();
        chatCacheEntityDaoConfig.initIdentityScope(type);

        chatCacheEntityDao = new ChatCacheEntityDao(chatCacheEntityDaoConfig, this);

        registerDao(ChatCacheEntity.class, chatCacheEntityDao);
    }
    
    public void clear() {
        chatCacheEntityDaoConfig.getIdentityScope().clear();
    }

    public ChatCacheEntityDao getChatCacheEntityDao() {
        return chatCacheEntityDao;
    }

}
