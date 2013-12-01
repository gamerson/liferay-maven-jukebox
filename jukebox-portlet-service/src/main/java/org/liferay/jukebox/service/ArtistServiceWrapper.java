package org.liferay.jukebox.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ArtistService}.
 *
 * @author Julio Camarero
 * @see ArtistService
 * @generated
 */
public class ArtistServiceWrapper implements ArtistService,
    ServiceWrapper<ArtistService> {
    private ArtistService _artistService;

    public ArtistServiceWrapper(ArtistService artistService) {
        _artistService = artistService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _artistService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _artistService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _artistService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public org.liferay.jukebox.model.Artist addArtist(java.lang.String name,
        java.lang.String bio, java.io.InputStream inputStream,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _artistService.addArtist(name, bio, inputStream, serviceContext);
    }

    @Override
    public org.liferay.jukebox.model.Artist deleteArtist(long artistId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _artistService.deleteArtist(artistId, serviceContext);
    }

    @Override
    public java.util.List<org.liferay.jukebox.model.Artist> getArtists(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _artistService.getArtists(groupId);
    }

    @Override
    public java.util.List<org.liferay.jukebox.model.Artist> getArtists(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _artistService.getArtists(groupId, start, end);
    }

    @Override
    public java.util.List<org.liferay.jukebox.model.Artist> getArtists(
        long groupId, java.lang.String keywords)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _artistService.getArtists(groupId, keywords);
    }

    @Override
    public int getArtistsCount(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _artistService.getArtistsCount(groupId);
    }

    @Override
    public int getArtistsCount(long groupId, java.lang.String keywords)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _artistService.getArtistsCount(groupId, keywords);
    }

    @Override
    public org.liferay.jukebox.model.Artist updateArtist(long artistId,
        java.lang.String name, java.lang.String bio,
        java.io.InputStream inputStream,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _artistService.updateArtist(artistId, name, bio, inputStream,
            serviceContext);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public ArtistService getWrappedArtistService() {
        return _artistService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedArtistService(ArtistService artistService) {
        _artistService = artistService;
    }

    @Override
    public ArtistService getWrappedService() {
        return _artistService;
    }

    @Override
    public void setWrappedService(ArtistService artistService) {
        _artistService = artistService;
    }
}
