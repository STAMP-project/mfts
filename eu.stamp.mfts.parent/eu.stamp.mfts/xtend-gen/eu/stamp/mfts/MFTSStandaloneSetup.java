/**
 * generated by Xtext 2.12.0
 */
package eu.stamp.mfts;

import eu.stamp.mfts.MFTSStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class MFTSStandaloneSetup extends MFTSStandaloneSetupGenerated {
  public static void doSetup() {
    new MFTSStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
