package net.www.webnutritionist.service;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import net.www.webnutritionist.entity.Profile;

public interface FindProfileService {

	@Nonnull Page<Profile> findAll(@Nonnull Pageable pageable);

	@Nullable Profile findByUid(@Nonnull String uid);

	@Nonnull Page<Profile> findBySearchQuery(@Nonnull String query, @Nonnull Pageable pageable);

	void restoreAccess(@Nonnull String anyUnigueId);
	
	@Nullable Profile findByRestoreToken(@Nonnull String token);
	
	@Nonnull Iterable<Profile> findAllForIndexing();
}
