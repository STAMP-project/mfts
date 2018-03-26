/**
 * generated by Xtext 2.12.0
 */
package eu.stamp.mfts.mFTS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.stamp.mfts.mFTS.BooleanLiteral#isBoolValue <em>Bool Value</em>}</li>
 * </ul>
 *
 * @see eu.stamp.mfts.mFTS.MFTSPackage#getBooleanLiteral()
 * @model
 * @generated
 */
public interface BooleanLiteral extends Expression
{
  /**
   * Returns the value of the '<em><b>Bool Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bool Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bool Value</em>' attribute.
   * @see #setBoolValue(boolean)
   * @see eu.stamp.mfts.mFTS.MFTSPackage#getBooleanLiteral_BoolValue()
   * @model
   * @generated
   */
  boolean isBoolValue();

  /**
   * Sets the value of the '{@link eu.stamp.mfts.mFTS.BooleanLiteral#isBoolValue <em>Bool Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool Value</em>' attribute.
   * @see #isBoolValue()
   * @generated
   */
  void setBoolValue(boolean value);

} // BooleanLiteral