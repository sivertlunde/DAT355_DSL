/**
 */
package timedStateMachine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link timedStateMachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link timedStateMachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link timedStateMachine.Transition#getTimer <em>Timer</em>}</li>
 * </ul>
 *
 * @see timedStateMachine.TimedStateMachinePackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link timedStateMachine.State#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see timedStateMachine.TimedStateMachinePackage#getTransition_Target()
	 * @see timedStateMachine.State#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link timedStateMachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link timedStateMachine.State#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @see timedStateMachine.TimedStateMachinePackage#getTransition_Source()
	 * @see timedStateMachine.State#getOutgoing
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link timedStateMachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

	/**
	 * Returns the value of the '<em><b>Timer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timer</em>' containment reference.
	 * @see #setTimer(TimeEvent)
	 * @see timedStateMachine.TimedStateMachinePackage#getTransition_Timer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeEvent getTimer();

	/**
	 * Sets the value of the '{@link timedStateMachine.Transition#getTimer <em>Timer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timer</em>' containment reference.
	 * @see #getTimer()
	 * @generated
	 */
	void setTimer(TimeEvent value);

} // Transition
