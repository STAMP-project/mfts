/**
 * generated by Xtext 2.12.0
 */
package eu.stamp.mfts.mFTS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.stamp.mfts.mFTS.Expect#getService <em>Service</em>}</li>
 *   <li>{@link eu.stamp.mfts.mFTS.Expect#getMessage <em>Message</em>}</li>
 *   <li>{@link eu.stamp.mfts.mFTS.Expect#getTime <em>Time</em>}</li>
 *   <li>{@link eu.stamp.mfts.mFTS.Expect#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link eu.stamp.mfts.mFTS.Expect#getAsserts <em>Asserts</em>}</li>
 * </ul>
 *
 * @see eu.stamp.mfts.mFTS.MFTSPackage#getExpect()
 * @model
 * @generated
 */
public interface Expect extends Action
{
  /**
   * Returns the value of the '<em><b>Service</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service</em>' reference.
   * @see #setService(Service)
   * @see eu.stamp.mfts.mFTS.MFTSPackage#getExpect_Service()
   * @model
   * @generated
   */
  Service getService();

  /**
   * Sets the value of the '{@link eu.stamp.mfts.mFTS.Expect#getService <em>Service</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Service</em>' reference.
   * @see #getService()
   * @generated
   */
  void setService(Service value);

  /**
   * Returns the value of the '<em><b>Message</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Message</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message</em>' reference.
   * @see #setMessage(Message)
   * @see eu.stamp.mfts.mFTS.MFTSPackage#getExpect_Message()
   * @model
   * @generated
   */
  Message getMessage();

  /**
   * Sets the value of the '{@link eu.stamp.mfts.mFTS.Expect#getMessage <em>Message</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Message</em>' reference.
   * @see #getMessage()
   * @generated
   */
  void setMessage(Message value);

  /**
   * Returns the value of the '<em><b>Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Time</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' containment reference.
   * @see #setTime(TimeInterval)
   * @see eu.stamp.mfts.mFTS.MFTSPackage#getExpect_Time()
   * @model containment="true"
   * @generated
   */
  TimeInterval getTime();

  /**
   * Sets the value of the '{@link eu.stamp.mfts.mFTS.Expect#getTime <em>Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' containment reference.
   * @see #getTime()
   * @generated
   */
  void setTime(TimeInterval value);

  /**
   * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
   * The list contents are of type {@link eu.stamp.mfts.mFTS.PlatformAnnotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotations</em>' containment reference list.
   * @see eu.stamp.mfts.mFTS.MFTSPackage#getExpect_Annotations()
   * @model containment="true"
   * @generated
   */
  EList<PlatformAnnotation> getAnnotations();

  /**
   * Returns the value of the '<em><b>Asserts</b></em>' containment reference list.
   * The list contents are of type {@link eu.stamp.mfts.mFTS.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Asserts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Asserts</em>' containment reference list.
   * @see eu.stamp.mfts.mFTS.MFTSPackage#getExpect_Asserts()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getAsserts();

} // Expect