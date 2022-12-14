package net.www.webnutritionist.component;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface TemplateResolver {

	@Nonnull String resolve(@Nonnull String template, @Nullable Object model);
}
