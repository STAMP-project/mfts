/**
 * generated by Xtext 2.12.0
 */
package eu.stamp.mfts.mFTS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Double Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.stamp.mfts.mFTS.DoubleLiteral#getDoubleValue <em>Double Value</em>}</li>
 * </ul>
 *
 * @see eu.stamp.mfts.mFTS.MFTSPackage#getDoubleLiteral()
 * @model
 * @generated
 */
public interface DoubleLiteral extends Expression
{
  /**
   * Returns the value of the '<em><b>Double Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Double Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Double Value</em>' attribute.
   * @see #setDoubleValue(double)
   * @see eu.stamp.mfts.mFTS.MFTSPackage#getDoubleLiteral_DoubleValue()
   * @model
   * @generated
   */
  double getDoubleValue();

  /**
   * Sets the value of the '{@link eu.stamp.mfts.mFTS.DoubleLiteral#getDoubleValue <em>Double Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Double Value</em>' attribute.
   * @see #getDoubleValue()
   * @generated
   */
  void setDoubleValue(double value);

} // DoubleLiteral