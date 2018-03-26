/**
 * generated by Xtext 2.12.0
 */
package eu.stamp.mfts.mFTS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.stamp.mfts.mFTS.StringLiteral#getStringValue <em>String Value</em>}</li>
 * </ul>
 *
 * @see eu.stamp.mfts.mFTS.MFTSPackage#getStringLiteral()
 * @model
 * @generated
 */
public interface StringLiteral extends Expression
{
  /**
   * Returns the value of the '<em><b>String Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String Value</em>' attribute.
   * @see #setStringValue(String)
   * @see eu.stamp.mfts.mFTS.MFTSPackage#getStringLiteral_StringValue()
   * @model
   * @generated
   */
  String getStringValue();

  /**
   * Sets the value of the '{@link eu.stamp.mfts.mFTS.StringLiteral#getStringValue <em>String Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String Value</em>' attribute.
   * @see #getStringValue()
   * @generated
   */
  void setStringValue(String value);

} // StringLiteral
