package org.jenkinsci.plugins.p4_client.populate;

import hudson.Extension;

import org.kohsuke.stapler.DataBoundConstructor;

public class ForceCleanImpl extends Populate {

	/**
	 * Force sync of workspace (optional have update)
	 * 
	 * @param have
	 */
	@DataBoundConstructor
	public ForceCleanImpl(boolean have, String pin) {
		super(have, true, pin);
	}

	@Extension
	public static final class DescriptorImpl extends PopulateDescriptor {

		@Override
		public String getDisplayName() {
			return "Forced clean and sync";
		}
	}
}