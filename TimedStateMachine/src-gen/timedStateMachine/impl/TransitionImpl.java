/**
 */
package timedStateMachine.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import timedStateMachine.State;
import timedStateMachine.TimeEvent;
import timedStateMachine.TimedStateMachinePackage;
import timedStateMachine.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link timedStateMachine.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link timedStateMachine.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link timedStateMachine.impl.TransitionImpl#getTimer <em>Timer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends NamedElementImpl implements Transition {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected State target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected State source;

	/**
	 * The cached value of the '{@link #getTimer() <em>Timer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer()
	 * @generated
	 * @ordered
	 */
	protected TimeEvent timer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimedStateMachinePackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (State) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TimedStateMachinePackage.TRANSITION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(State newTarget, NotificationChain msgs) {
		State oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TimedStateMachinePackage.TRANSITION__TARGET, oldTarget, newTarget);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(State newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this, TimedStateMachinePackage.STATE__INCOMING,
						State.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject) newTarget).eInverseAdd(this, TimedStateMachinePackage.STATE__INCOMING,
						State.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimedStateMachinePackage.TRANSITION__TARGET,
					newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (State) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TimedStateMachinePackage.TRANSITION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(State newSource, NotificationChain msgs) {
		State oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TimedStateMachinePackage.TRANSITION__SOURCE, oldSource, newSource);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(State newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this, TimedStateMachinePackage.STATE__OUTGOING,
						State.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject) newSource).eInverseAdd(this, TimedStateMachinePackage.STATE__OUTGOING,
						State.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimedStateMachinePackage.TRANSITION__SOURCE,
					newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeEvent getTimer() {
		return timer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimer(TimeEvent newTimer, NotificationChain msgs) {
		TimeEvent oldTimer = timer;
		timer = newTimer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TimedStateMachinePackage.TRANSITION__TIMER, oldTimer, newTimer);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer(TimeEvent newTimer) {
		if (newTimer != timer) {
			NotificationChain msgs = null;
			if (timer != null)
				msgs = ((InternalEObject) timer).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TimedStateMachinePackage.TRANSITION__TIMER, null, msgs);
			if (newTimer != null)
				msgs = ((InternalEObject) newTimer).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TimedStateMachinePackage.TRANSITION__TIMER, null, msgs);
			msgs = basicSetTimer(newTimer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimedStateMachinePackage.TRANSITION__TIMER, newTimer,
					newTimer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TimedStateMachinePackage.TRANSITION__TARGET:
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this, TimedStateMachinePackage.STATE__INCOMING,
						State.class, msgs);
			return basicSetTarget((State) otherEnd, msgs);
		case TimedStateMachinePackage.TRANSITION__SOURCE:
			if (source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this, TimedStateMachinePackage.STATE__OUTGOING,
						State.class, msgs);
			return basicSetSource((State) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TimedStateMachinePackage.TRANSITION__TARGET:
			return basicSetTarget(null, msgs);
		case TimedStateMachinePackage.TRANSITION__SOURCE:
			return basicSetSource(null, msgs);
		case TimedStateMachinePackage.TRANSITION__TIMER:
			return basicSetTimer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TimedStateMachinePackage.TRANSITION__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		case TimedStateMachinePackage.TRANSITION__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case TimedStateMachinePackage.TRANSITION__TIMER:
			return getTimer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TimedStateMachinePackage.TRANSITION__TARGET:
			setTarget((State) newValue);
			return;
		case TimedStateMachinePackage.TRANSITION__SOURCE:
			setSource((State) newValue);
			return;
		case TimedStateMachinePackage.TRANSITION__TIMER:
			setTimer((TimeEvent) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case TimedStateMachinePackage.TRANSITION__TARGET:
			setTarget((State) null);
			return;
		case TimedStateMachinePackage.TRANSITION__SOURCE:
			setSource((State) null);
			return;
		case TimedStateMachinePackage.TRANSITION__TIMER:
			setTimer((TimeEvent) null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TimedStateMachinePackage.TRANSITION__TARGET:
			return target != null;
		case TimedStateMachinePackage.TRANSITION__SOURCE:
			return source != null;
		case TimedStateMachinePackage.TRANSITION__TIMER:
			return timer != null;
		}
		return super.eIsSet(featureID);
	}

} //TransitionImpl
