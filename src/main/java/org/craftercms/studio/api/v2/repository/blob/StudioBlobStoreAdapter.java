/*
 * Copyright (C) 2007-2020 Crafter Software Corporation. All Rights Reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General default License version 3 as published by
 * the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General default License for more details.
 *
 * You should have received a copy of the GNU General default License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.craftercms.studio.api.v2.repository.blob;

import org.craftercms.studio.api.v1.repository.RepositoryItem;
import org.craftercms.studio.api.v1.to.RemoteRepositoryInfoTO;
import org.craftercms.studio.api.v1.to.VersionTO;
import org.craftercms.studio.api.v2.dal.GitLog;
import org.craftercms.studio.api.v2.dal.PublishingHistoryItem;
import org.craftercms.studio.api.v2.dal.RepoOperation;

import java.io.InputStream;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;

/**
 * Base class for all implementations of {@link StudioBlobStore}
 *
 * @author joseross
 * @since 3.1.6
 */
public interface StudioBlobStoreAdapter extends StudioBlobStore {

    // Unsupported operations
    // TODO: Remove when the API is split

    // Start API 1
    @Override
    default RepositoryItem[] getContentChildren(String site, String path) {
        // This should be handled by the local repository
        throw new UnsupportedOperationException();
    }

    @Override
    default VersionTO[] getContentVersionHistory(String site, String path) {
        // This should be handled by the local repository
        throw new UnsupportedOperationException();
    }

    @Override
    default String createVersion(String site, String path, boolean majorVersion) {
        // This should be handled by the local repository
        throw new UnsupportedOperationException();
    }

    @Override
    default String createVersion(String site, String path, String comment, boolean majorVersion) {
        // This should be handled by the local repository
        throw new UnsupportedOperationException();
    }

    @Override
    default String revertContent(String site, String path, String version, boolean major, String comment) {
        // This should be handled by the local repository
        throw new UnsupportedOperationException();
    }

    @Override
    default InputStream getContentVersion(String site, String path, String version) {
        // This should be handled by the local repository
        throw new UnsupportedOperationException();
    }

    @Override
    default void lockItem(String site, String path) {
        // This should be handled by the local repository
        throw new UnsupportedOperationException();
    }

    @Override
    default void lockItemForPublishing(String site, String path) {
        // This should be handled by the local repository
        throw new UnsupportedOperationException();
    }

    @Override
    default void unLockItem(String site, String path) {
        // This should be handled by the local repository
        throw new UnsupportedOperationException();
    }

    @Override
    default void unLockItemForPublishing(String site, String path) {
        // This should be handled by the local repository
        throw new UnsupportedOperationException();
    }

    @Override
    default boolean isFolder(String siteId, String path) {
        // This should be handled by the local repository
        throw new UnsupportedOperationException();
    }

    @Override
    default boolean createSiteFromBlueprint(String blueprintLocation, String siteId, String sandboxBranch,
                                           Map<String, String> params) {
        // This should be handled by the local repository
        throw new UnsupportedOperationException();
    }

    @Override
    default boolean deleteSite(String siteId) {
        // This should be handled by the local repository
        throw new UnsupportedOperationException();
    }

    @Override
    default void initialPublish(String site, String sandboxBranch, String environment, String author, String comment) {
        // This should be handled by the local repository
        throw new UnsupportedOperationException();
    }

    @Override
    default String getRepoLastCommitId(String site) {
        // This should be handled by the local repository
        throw new UnsupportedOperationException();
    }

    @Override
    default String getRepoFirstCommitId(String site) {
        // This should be handled by the local repository
        throw new UnsupportedOperationException();
    }

    @Override
    default List<String> getEditCommitIds(String site, String path, String commitIdFrom, String commitIdTo) {
        // This should be handled by the local repository
        throw new UnsupportedOperationException();
    }

    @Override
    default boolean commitIdExists(String site, String commitId) {
        // This should be handled by the local repository
        throw new UnsupportedOperationException();
    }

    @Override
    default void insertFullGitLog(String siteId, int processed) {
        // This should be handled by the local repository
        throw new UnsupportedOperationException();
    }

    @Override
    default void deleteGitLogForSite(String siteId) {
        // This should be handled by the local repository
        throw new UnsupportedOperationException();
    }

    @Override
    default boolean createSiteCloneRemote(String siteId, String sandboxBranch, String remoteName, String remoteUrl,
                                         String remoteBranch, boolean singleBranch, String authenticationType,
                                         String remoteUsername, String remotePassword, String remoteToken,
                                         String remotePrivateKey, Map<String, String> params, boolean createAsOrphan) {
        // This should be handled by the local repository
        throw new UnsupportedOperationException();
    }

    @Override
    default boolean createSitePushToRemote(String siteId, String remoteName, String remoteUrl,
                                          String authenticationType, String remoteUsername,
                                          String remotePassword, String remoteToken, String remotePrivateKey,
                                          boolean createAsOrphan) {
        // This should be handled by the local repository
        throw new UnsupportedOperationException();
    }

    @Override
    default boolean addRemote(String siteId, String remoteName, String remoteUrl, String authenticationType,
                             String remoteUsername, String remotePassword, String remoteToken,
                             String remotePrivateKey) {
        // This should be handled by the local repository
        throw new UnsupportedOperationException();
    }

    @Override
    default boolean removeRemote(String siteId, String remoteName) {
        // This should be handled by the local repository
        throw new UnsupportedOperationException();
    }

    @Override
    default void removeRemoteRepositoriesForSite(String siteId) {
        // This should be handled by the local repository
        throw new UnsupportedOperationException();
    }

    @Override
    default List<RemoteRepositoryInfoTO> listRemote(String siteId, String sandboxBranch) {
        // This should be handled by the local repository
        throw new UnsupportedOperationException();
    }

    @Override
    default boolean pushToRemote(String siteId, String remoteName, String remoteBranch) {
        // This should be handled by the local repository
        throw new UnsupportedOperationException();
    }

    @Override
    default boolean pullFromRemote(String siteId, String remoteName, String remoteBranch) {
        // This should be handled by the local repository
        throw new UnsupportedOperationException();
    }

    @Override
    default void resetStagingRepository(String siteId) {
        // This should be handled by the local repository
        throw new UnsupportedOperationException();
    }

    @Override
    default void reloadRepository(String siteId) {
        // This should be handled by the local repository
        throw new UnsupportedOperationException();
    }

    @Override
    default void cleanupRepositories(String siteId) {
        // This should be handled by the local repository
        throw new UnsupportedOperationException();
    }

    @Override
    default boolean repositoryExists(String site) {
        // This should be handled by the local repository
        throw new UnsupportedOperationException();
    }

    // Start API 2

    @Override
    default List<String> getSubtreeItems(String site, String path) {
        // This should be handled by the local repository
        throw new UnsupportedOperationException();
    }

    @Override
    default List<RepoOperation> getOperations(String site, String commitIdFrom, String commitIdTo) {
        // This should be handled by the local repository
        throw new UnsupportedOperationException();
    }

    @Override
    default List<RepoOperation> getOperationsFromDelta(String site, String commitIdFrom, String commitIdTo) {
        // This should be handled by the local repository
        throw new UnsupportedOperationException();
    }

    @Override
    default GitLog getGitLog(String siteId, String commitId) {
        // This should be handled by the local repository
        throw new UnsupportedOperationException();
    }

    @Override
    default void markGitLogVerifiedProcessed(String siteId, String commitId) {
        // This should be handled by the local repository
        throw new UnsupportedOperationException();
    }

    @Override
    default void insertGitLog(String siteId, String commitId, int processed) {
        // This should be handled by the local repository
        throw new UnsupportedOperationException();
    }

    @Override
    default List<PublishingHistoryItem> getPublishingHistory(String siteId, String environment, String path,
                                                      String publisher, ZonedDateTime fromDate, ZonedDateTime toDate,
                                                             int limit) {
        // This should be handled by the local repository
        throw new UnsupportedOperationException();
    }
}
