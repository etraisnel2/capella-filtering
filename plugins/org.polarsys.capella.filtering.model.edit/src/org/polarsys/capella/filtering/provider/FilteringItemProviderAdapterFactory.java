/*******************************************************************************
 * Copyright (c) 2018, 2019 THALES GLOBAL SERVICES.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.capella.filtering.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.polarsys.capella.filtering.FilteringFactory;
import org.polarsys.capella.filtering.util.FilteringAdapterFactory;

import org.polarsys.kitalpha.emde.extension.ModelExtensionHelper;

import org.polarsys.kitalpha.emde.model.EmdePackage;
import org.polarsys.kitalpha.emde.model.ExtensibleElement;
import org.polarsys.kitalpha.emde.model.edit.provider.NewChildDescriptorHelper;
import org.polarsys.kitalpha.emde.model.util.EmdeSwitch;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers. The adapters generated by this
 * factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}. The adapters
 * also support Eclipse property sheets. Note that most of the adapters are shared among multiple instances. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class FilteringItemProviderAdapterFactory extends FilteringAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FilteringItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.filtering.FilteringModel} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FilteringModelItemProvider filteringModelItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.filtering.FilteringModel}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFilteringModelAdapter() {
		if (filteringModelItemProvider == null) {
			filteringModelItemProvider = new FilteringModelItemProvider(this);
		}

		return filteringModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.filtering.FilteringCriterion} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FilteringCriterionItemProvider filteringCriterionItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.filtering.FilteringCriterion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFilteringCriterionAdapter() {
		if (filteringCriterionItemProvider == null) {
			filteringCriterionItemProvider = new FilteringCriterionItemProvider(this);
		}

		return filteringCriterionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.filtering.FilteringResults} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FilteringResultsItemProvider filteringResultsItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.filtering.FilteringResults}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFilteringResultsAdapter() {
		if (filteringResultsItemProvider == null) {
			filteringResultsItemProvider = new FilteringResultsItemProvider(this);
		}

		return filteringResultsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.filtering.FilteringResult} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FilteringResultItemProvider filteringResultItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.filtering.FilteringResult}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFilteringResultAdapter() {
		if (filteringResultItemProvider == null) {
			filteringResultItemProvider = new FilteringResultItemProvider(this);
		}

		return filteringResultItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.filtering.AssociatedFilteringCriterionSet} instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected AssociatedFilteringCriterionSetItemProvider associatedFilteringCriterionSetItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.filtering.AssociatedFilteringCriterionSet}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createAssociatedFilteringCriterionSetAdapter() {
		if (associatedFilteringCriterionSetItemProvider == null) {
			associatedFilteringCriterionSetItemProvider = new AssociatedFilteringCriterionSetItemProvider(this);
		}

		return associatedFilteringCriterionSetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.filtering.CreationDefaultFilteringCriterionSet} instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected CreationDefaultFilteringCriterionSetItemProvider creationDefaultFilteringCriterionSetItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.filtering.CreationDefaultFilteringCriterionSet}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createCreationDefaultFilteringCriterionSetAdapter() {
		if (creationDefaultFilteringCriterionSetItemProvider == null) {
			creationDefaultFilteringCriterionSetItemProvider = new CreationDefaultFilteringCriterionSetItemProvider(
					this);
		}

		return creationDefaultFilteringCriterionSetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.filtering.FilteringResultPkg} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FilteringResultPkgItemProvider filteringResultPkgItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.filtering.FilteringResultPkg}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFilteringResultPkgAdapter() {
		if (filteringResultPkgItemProvider == null) {
			filteringResultPkgItemProvider = new FilteringResultPkgItemProvider(this);
		}

		return filteringResultPkgItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.filtering.FilteringCriterionPkg} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FilteringCriterionPkgItemProvider filteringCriterionPkgItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.filtering.FilteringCriterionPkg}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFilteringCriterionPkgAdapter() {
		if (filteringCriterionPkgItemProvider == null) {
			filteringCriterionPkgItemProvider = new FilteringCriterionPkgItemProvider(this);
		}

		return filteringCriterionPkgItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.filtering.ComposedFilteringResult} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedFilteringResultItemProvider composedFilteringResultItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.filtering.ComposedFilteringResult}.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComposedFilteringResultAdapter() {
		if (composedFilteringResultItemProvider == null) {
			composedFilteringResultItemProvider = new ComposedFilteringResultItemProvider(this);
		}

		return composedFilteringResultItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.filtering.FilteringResultSet} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FilteringResultSetItemProvider filteringResultSetItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.filtering.FilteringResultSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFilteringResultSetAdapter() {
		if (filteringResultSetItemProvider == null) {
			filteringResultSetItemProvider = new FilteringResultSetItemProvider(this);
		}

		return filteringResultSetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.filtering.UnionFilteringResultSet} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected UnionFilteringResultSetItemProvider unionFilteringResultSetItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.filtering.UnionFilteringResultSet}.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnionFilteringResultSetAdapter() {
		if (unionFilteringResultSetItemProvider == null) {
			unionFilteringResultSetItemProvider = new UnionFilteringResultSetItemProvider(this);
		}

		return unionFilteringResultSetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.filtering.ExclusionFilteringResultSet} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ExclusionFilteringResultSetItemProvider exclusionFilteringResultSetItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.filtering.ExclusionFilteringResultSet}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createExclusionFilteringResultSetAdapter() {
		if (exclusionFilteringResultSetItemProvider == null) {
			exclusionFilteringResultSetItemProvider = new ExclusionFilteringResultSetItemProvider(this);
		}

		return exclusionFilteringResultSetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.filtering.IntersectionFilteringResultSet} instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected IntersectionFilteringResultSetItemProvider intersectionFilteringResultSetItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.filtering.IntersectionFilteringResultSet}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createIntersectionFilteringResultSetAdapter() {
		if (intersectionFilteringResultSetItemProvider == null) {
			intersectionFilteringResultSetItemProvider = new IntersectionFilteringResultSetItemProvider(this);
		}

		return intersectionFilteringResultSetItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (filteringModelItemProvider != null)
			filteringModelItemProvider.dispose();
		if (filteringCriterionItemProvider != null)
			filteringCriterionItemProvider.dispose();
		if (filteringResultsItemProvider != null)
			filteringResultsItemProvider.dispose();
		if (filteringResultItemProvider != null)
			filteringResultItemProvider.dispose();
		if (associatedFilteringCriterionSetItemProvider != null)
			associatedFilteringCriterionSetItemProvider.dispose();
		if (creationDefaultFilteringCriterionSetItemProvider != null)
			creationDefaultFilteringCriterionSetItemProvider.dispose();
		if (filteringResultPkgItemProvider != null)
			filteringResultPkgItemProvider.dispose();
		if (filteringCriterionPkgItemProvider != null)
			filteringCriterionPkgItemProvider.dispose();
		if (composedFilteringResultItemProvider != null)
			composedFilteringResultItemProvider.dispose();
		if (filteringResultSetItemProvider != null)
			filteringResultSetItemProvider.dispose();
		if (unionFilteringResultSetItemProvider != null)
			unionFilteringResultSetItemProvider.dispose();
		if (exclusionFilteringResultSetItemProvider != null)
			exclusionFilteringResultSetItemProvider.dispose();
		if (intersectionFilteringResultSetItemProvider != null)
			intersectionFilteringResultSetItemProvider.dispose();
	}

	/**
	 * A child creation extender for the {@link EmdePackage}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static class EmdeChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends EmdeSwitch<Object> {
			/**
			 * The child descriptors being populated.
			 * <!-- begin-user-doc --> <!-- end-user-doc -->
			 * @generated
			 */
			protected List<Object> newChildDescriptors;

			/**
			 * The domain in which to create the children.
			 * <!-- begin-user-doc --> <!-- end-user-doc -->
			 * @generated
			 */
			protected EditingDomain editingDomain;

			/**
			 * Creates the a switch for populating child descriptors in the given domain.
			 * <!-- begin-user-doc --> <!--
			 * end-user-doc -->
			 * @generated
			 */
			CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) {
				this.newChildDescriptors = newChildDescriptors;
				this.editingDomain = editingDomain;
			}

			/**
			 * <!-- begin-user-doc --> <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseExtensibleElement(ExtensibleElement object) {
				// begin-extension-code
				if (ModelExtensionHelper.getInstance(object).isExtensionModelDisabled(
						EcoreUtil.getRootContainer(object).eClass().getEPackage().getNsURI(),
						"http://www.polarsys.org/capella/filtering/6.0.0")) { //$NON-NLS-1$
					return null;
				}
				// end-extension-code
				// begin-extension-code
				{
					CommandParameter commandParameter = createChildParameter(
							EmdePackage.Literals.EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS,
							FilteringFactory.eINSTANCE.createFilteringModel());
					if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
						newChildDescriptors.add(commandParameter);
					}
				}
				// end-extension-code

				// begin-extension-code
				{
					CommandParameter commandParameter = createChildParameter(
							EmdePackage.Literals.EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS,
							FilteringFactory.eINSTANCE.createFilteringResults());
					if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
						newChildDescriptors.add(commandParameter);
					}
				}
				// end-extension-code

				// begin-extension-code
				{
					CommandParameter commandParameter = createChildParameter(
							EmdePackage.Literals.EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS,
							FilteringFactory.eINSTANCE.createAssociatedFilteringCriterionSet());
					if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
						newChildDescriptors.add(commandParameter);
					}
				}
				// end-extension-code

				// begin-extension-code
				{
					CommandParameter commandParameter = createChildParameter(
							EmdePackage.Literals.EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS,
							FilteringFactory.eINSTANCE.createCreationDefaultFilteringCriterionSet());
					if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
						newChildDescriptors.add(commandParameter);
					}
				}
				// end-extension-code

				return null;
			}

			/**
			 * <!-- begin-user-doc --> <!-- end-user-doc -->
			 * @generated
			 */
			protected CommandParameter createChildParameter(Object feature, Object child) {
				return new CommandParameter(null, feature, child);
			}

		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
			ArrayList<Object> result = new ArrayList<Object>();
			new CreationSwitch(result, editingDomain).doSwitch((EObject) object);
			return result;
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		public ResourceLocator getResourceLocator() {
			return FilteringEditPlugin.INSTANCE;
		}
	}

}
