
package org.polarsys.capella.filtering.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;

import org.polarsys.capella.filtering.AbstractFilteringResult;
import org.polarsys.capella.filtering.FilteringPackage;
import org.polarsys.capella.filtering.FilteringResultSet;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Result Set</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.filtering.impl.FilteringResultSetImpl#getFilteringResults <em>Filtering Results</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilteringResultSetImpl extends NamedElementImpl implements FilteringResultSet {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FilteringResultSetImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FilteringPackage.Literals.FILTERING_RESULT_SET;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	@Override
	public EList<AbstractFilteringResult> getFilteringResults() {

		return (EList<AbstractFilteringResult>) eDynamicGet(FilteringPackage.FILTERING_RESULT_SET__FILTERING_RESULTS,
				FilteringPackage.Literals.FILTERING_RESULT_SET__FILTERING_RESULTS, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FilteringPackage.FILTERING_RESULT_SET__FILTERING_RESULTS:
			return getFilteringResults();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FilteringPackage.FILTERING_RESULT_SET__FILTERING_RESULTS:
			getFilteringResults().clear();
			getFilteringResults().addAll((Collection<? extends AbstractFilteringResult>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case FilteringPackage.FILTERING_RESULT_SET__FILTERING_RESULTS:
			getFilteringResults().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case FilteringPackage.FILTERING_RESULT_SET__FILTERING_RESULTS:
			return !getFilteringResults().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // FilteringResultSetImpl