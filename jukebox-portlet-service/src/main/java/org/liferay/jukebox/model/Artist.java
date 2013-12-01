package org.liferay.jukebox.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the Artist service. Represents a row in the &quot;jukebox_Artist&quot; database table, with each column mapped to a property of this class.
 *
 * @author Julio Camarero
 * @see ArtistModel
 * @see org.liferay.jukebox.model.impl.ArtistImpl
 * @see org.liferay.jukebox.model.impl.ArtistModelImpl
 * @generated
 */
public interface Artist extends ArtistModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link org.liferay.jukebox.model.impl.ArtistImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public com.liferay.portal.kernel.repository.model.FileEntry getCustomImage()
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.lang.String getImageURL(
        com.liferay.portal.theme.ThemeDisplay themeDisplay)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public boolean hasCustomImage()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;
}
