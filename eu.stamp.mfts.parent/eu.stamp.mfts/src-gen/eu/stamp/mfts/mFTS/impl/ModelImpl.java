/**
 * generated by Xtext 2.12.0
 */
package eu.stamp.mfts.mFTS.impl;

import eu.stamp.mfts.mFTS.MFTSPackage;
import eu.stamp.mfts.mFTS.Message;
import eu.stamp.mfts.mFTS.Model;
import eu.stamp.mfts.mFTS.Service;
import eu.stamp.mfts.mFTS.ServiceInterface;
import eu.stamp.mfts.mFTS.TestSequence;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.stamp.mfts.mFTS.impl.ModelImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link eu.stamp.mfts.mFTS.impl.ModelImpl#getServices <em>Services</em>}</li>
 *   <li>{@link eu.stamp.mfts.mFTS.impl.ModelImpl#getMessages <em>Messages</em>}</li>
 *   <li>{@link eu.stamp.mfts.mFTS.impl.ModelImpl#getTests <em>Tests</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaces()
   * @generated
   * @ordered
   */
  protected EList<ServiceInterface> interfaces;

  /**
   * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServices()
   * @generated
   * @ordered
   */
  protected EList<Service> services;

  /**
   * The cached value of the '{@link #getMessages() <em>Messages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessages()
   * @generated
   * @ordered
   */
  protected EList<Message> messages;

  /**
   * The cached value of the '{@link #getTests() <em>Tests</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTests()
   * @generated
   * @ordered
   */
  protected EList<TestSequence> tests;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MFTSPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ServiceInterface> getInterfaces()
  {
    if (interfaces == null)
    {
      interfaces = new EObjectContainmentEList<ServiceInterface>(ServiceInterface.class, this, MFTSPackage.MODEL__INTERFACES);
    }
    return interfaces;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Service> getServices()
  {
    if (services == null)
    {
      services = new EObjectContainmentEList<Service>(Service.class, this, MFTSPackage.MODEL__SERVICES);
    }
    return services;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Message> getMessages()
  {
    if (messages == null)
    {
      messages = new EObjectContainmentEList<Message>(Message.class, this, MFTSPackage.MODEL__MESSAGES);
    }
    return messages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TestSequence> getTests()
  {
    if (tests == null)
    {
      tests = new EObjectContainmentEList<TestSequence>(TestSequence.class, this, MFTSPackage.MODEL__TESTS);
    }
    return tests;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MFTSPackage.MODEL__INTERFACES:
        return ((InternalEList<?>)getInterfaces()).basicRemove(otherEnd, msgs);
      case MFTSPackage.MODEL__SERVICES:
        return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
      case MFTSPackage.MODEL__MESSAGES:
        return ((InternalEList<?>)getMessages()).basicRemove(otherEnd, msgs);
      case MFTSPackage.MODEL__TESTS:
        return ((InternalEList<?>)getTests()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MFTSPackage.MODEL__INTERFACES:
        return getInterfaces();
      case MFTSPackage.MODEL__SERVICES:
        return getServices();
      case MFTSPackage.MODEL__MESSAGES:
        return getMessages();
      case MFTSPackage.MODEL__TESTS:
        return getTests();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MFTSPackage.MODEL__INTERFACES:
        getInterfaces().clear();
        getInterfaces().addAll((Collection<? extends ServiceInterface>)newValue);
        return;
      case MFTSPackage.MODEL__SERVICES:
        getServices().clear();
        getServices().addAll((Collection<? extends Service>)newValue);
        return;
      case MFTSPackage.MODEL__MESSAGES:
        getMessages().clear();
        getMessages().addAll((Collection<? extends Message>)newValue);
        return;
      case MFTSPackage.MODEL__TESTS:
        getTests().clear();
        getTests().addAll((Collection<? extends TestSequence>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MFTSPackage.MODEL__INTERFACES:
        getInterfaces().clear();
        return;
      case MFTSPackage.MODEL__SERVICES:
        getServices().clear();
        return;
      case MFTSPackage.MODEL__MESSAGES:
        getMessages().clear();
        return;
      case MFTSPackage.MODEL__TESTS:
        getTests().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MFTSPackage.MODEL__INTERFACES:
        return interfaces != null && !interfaces.isEmpty();
      case MFTSPackage.MODEL__SERVICES:
        return services != null && !services.isEmpty();
      case MFTSPackage.MODEL__MESSAGES:
        return messages != null && !messages.isEmpty();
      case MFTSPackage.MODEL__TESTS:
        return tests != null && !tests.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl