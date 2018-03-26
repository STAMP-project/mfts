/**
 * generated by Xtext 2.12.0
 */
package eu.stamp.mfts.mFTS.impl;

import eu.stamp.mfts.mFTS.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MFTSFactoryImpl extends EFactoryImpl implements MFTSFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MFTSFactory init()
  {
    try
    {
      MFTSFactory theMFTSFactory = (MFTSFactory)EPackage.Registry.INSTANCE.getEFactory(MFTSPackage.eNS_URI);
      if (theMFTSFactory != null)
      {
        return theMFTSFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MFTSFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MFTSFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MFTSPackage.MODEL: return createModel();
      case MFTSPackage.PLATFORM_ANNOTATION: return createPlatformAnnotation();
      case MFTSPackage.SERVICE_INTERFACE: return createServiceInterface();
      case MFTSPackage.MESSAGE: return createMessage();
      case MFTSPackage.PARAMETER: return createParameter();
      case MFTSPackage.SERVICE: return createService();
      case MFTSPackage.TEST_SEQUENCE: return createTestSequence();
      case MFTSPackage.ACTION: return createAction();
      case MFTSPackage.PAR: return createPar();
      case MFTSPackage.SEQ: return createSeq();
      case MFTSPackage.WAIT: return createWait();
      case MFTSPackage.SEND: return createSend();
      case MFTSPackage.EXPECT: return createExpect();
      case MFTSPackage.TIME_INTERVAL: return createTimeInterval();
      case MFTSPackage.EXPRESSION: return createExpression();
      case MFTSPackage.EXTERN_EXPRESSION: return createExternExpression();
      case MFTSPackage.BYTE_LITERAL: return createByteLiteral();
      case MFTSPackage.CHAR_LITERAL: return createCharLiteral();
      case MFTSPackage.INTEGER_LITERAL: return createIntegerLiteral();
      case MFTSPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
      case MFTSPackage.STRING_LITERAL: return createStringLiteral();
      case MFTSPackage.DOUBLE_LITERAL: return createDoubleLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlatformAnnotation createPlatformAnnotation()
  {
    PlatformAnnotationImpl platformAnnotation = new PlatformAnnotationImpl();
    return platformAnnotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceInterface createServiceInterface()
  {
    ServiceInterfaceImpl serviceInterface = new ServiceInterfaceImpl();
    return serviceInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Message createMessage()
  {
    MessageImpl message = new MessageImpl();
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service createService()
  {
    ServiceImpl service = new ServiceImpl();
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TestSequence createTestSequence()
  {
    TestSequenceImpl testSequence = new TestSequenceImpl();
    return testSequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Par createPar()
  {
    ParImpl par = new ParImpl();
    return par;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Seq createSeq()
  {
    SeqImpl seq = new SeqImpl();
    return seq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Wait createWait()
  {
    WaitImpl wait = new WaitImpl();
    return wait;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Send createSend()
  {
    SendImpl send = new SendImpl();
    return send;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expect createExpect()
  {
    ExpectImpl expect = new ExpectImpl();
    return expect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeInterval createTimeInterval()
  {
    TimeIntervalImpl timeInterval = new TimeIntervalImpl();
    return timeInterval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternExpression createExternExpression()
  {
    ExternExpressionImpl externExpression = new ExternExpressionImpl();
    return externExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ByteLiteral createByteLiteral()
  {
    ByteLiteralImpl byteLiteral = new ByteLiteralImpl();
    return byteLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CharLiteral createCharLiteral()
  {
    CharLiteralImpl charLiteral = new CharLiteralImpl();
    return charLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerLiteral createIntegerLiteral()
  {
    IntegerLiteralImpl integerLiteral = new IntegerLiteralImpl();
    return integerLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral createBooleanLiteral()
  {
    BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
    return booleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleLiteral createDoubleLiteral()
  {
    DoubleLiteralImpl doubleLiteral = new DoubleLiteralImpl();
    return doubleLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MFTSPackage getMFTSPackage()
  {
    return (MFTSPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MFTSPackage getPackage()
  {
    return MFTSPackage.eINSTANCE;
  }

} //MFTSFactoryImpl
